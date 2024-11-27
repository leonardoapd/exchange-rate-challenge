package com.alura.perdomod.controllers;

import com.alura.perdomod.services.CurrencyConverterService;

public class ConversionHandler {
    private final CurrencyConverterService service;

    public ConversionHandler(CurrencyConverterService service) {
        this.service = service;
    }

    public void handleConversion(int option, double amount) {
        switch (option) {
            case 1:
                System.out.printf("El valor %.2f [USD] corresponde a %.2f [ARS]\n\n", amount,
                        service.convertUSDtoARS(amount));
                break;
            case 2:
                System.out.printf("El valor %.2f [ARS] corresponde a %.2f [USD]\n\n", amount,
                        service.convertARStoUSD(amount));
                break;
            case 3:
                System.out.printf("El valor %.2f [USD] corresponde a %.2f [COP]\n\n", amount,
                        service.convertUSDtoCOP(amount));
                break;
            case 4:
                System.out.printf("El valor %.2f [COP] corresponde a %.2f [USD]\n\n", amount,
                        service.convertCOPtoUSD(amount));
                break;
            case 5:
                System.out.printf("El valor %.2f [USD] corresponde a %.2f [MXN]\n\n", amount,
                        service.convertUSDtoMXN(amount));
                break;
            case 6:
                System.out.printf("El valor %.2f [MXN] corresponde a %.2f [USD]\n\n", amount,
                        service.convertMXNtoUSD(amount));
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
    }
}
