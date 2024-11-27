package com.alura.perdomod.controllers;

public class MenuPrinter {
    public void printMenu() {
        System.out.println("##############################################################");
        System.out.println("          Bienvenido al conversor de monedas JAVA             ");
        String[] art = { 
            "       .-                      .-                .       ",
            "      (  . ..-..-..-,.-..-. . (  .-..-.. ..-,.-.-|-.-,.-.",
            "       `-'-''  '  `'-' '`-'-|  `-`-'' ' ` `'-'   '-`'-'  ",
            "                          `-'                            "
        };
        for (String line : art) {
            System.out.println(line);
        }
        System.out.println("##############################################################");
        System.out.println("\n");
        System.out.println("1) Convertir de Dólar a Peso Argentino");
        System.out.println("2) Convertir de Peso Argentino a Dólar");
        System.out.println("3) Convertir de Dólar a Peso Colombiano");
        System.out.println("4) Convertir de Peso Colombiano a Dólar");
        System.out.println("5) Convertir de Dólar a Peso Mexicano");
        System.out.println("6) Convertir de Peso Mexicano a Dólar");
        System.out.println("7) Salir");
        System.out.println("\n");
        System.out.println("Ingrese una opcion válida: ");
        System.out.println("###############################################################");

    }
}
