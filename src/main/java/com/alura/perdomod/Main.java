package com.alura.perdomod;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
// import java.util.logging.Logger;

import com.alura.perdomod.controllers.ConversionHandler;
import com.alura.perdomod.controllers.MenuPrinter;
import com.alura.perdomod.dtos.ConversionInfo;
import com.alura.perdomod.services.CurrencyConverterService;
import com.google.gson.Gson;

public class Main {
    // private static final Logger logger = Logger.getLogger(Main.class.getName());
    private static final String API_KEY = "8b4a0da10ba151356657fc07";
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/USD";

    public static void main(String[] args) {
        Gson gson = new Gson();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(API_URL)).build();

        try {
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            ConversionInfo conversionInfo = gson.fromJson(response.body(), ConversionInfo.class);
            // logger.info(conversionInfo.toString());

            CurrencyConverterService converterService = new CurrencyConverterService(conversionInfo);
            ConversionHandler conversionHandler = new ConversionHandler(converterService);
            MenuPrinter menuPrinter = new MenuPrinter();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                menuPrinter.printMenu();
                int option = scanner.nextInt();
                if (option == 7 || !(option >= 1 && option <= 6)) {
                    System.out.println("Gracias por usar el conversor de monedas JAVA");
                    break;
                }

                System.out.println("Ingrese la cantidad a convertir: ");
                double amount = scanner.nextDouble();
                conversionHandler.handleConversion(option, amount);
            }

            scanner.close();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
