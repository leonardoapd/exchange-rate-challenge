package com.alura.perdomod.services;

import com.alura.perdomod.dtos.ConversionInfo;

public class CurrencyConverterService {
    private final ConversionInfo conversionInfo;

    public CurrencyConverterService(ConversionInfo conversionInfo) {
        this.conversionInfo = conversionInfo;
    }

    public double convertUSDtoARS(double amount) {
        return amount * Double.parseDouble(conversionInfo.conversion_rates().ars());
    }

    public double convertARStoUSD(double amount) {
        return amount / Double.parseDouble(conversionInfo.conversion_rates().ars());
    }

    public double convertUSDtoCOP(double amount) {
        return amount * Double.parseDouble(conversionInfo.conversion_rates().cop());
    }

    public double convertCOPtoUSD(double amount) {
        return amount / Double.parseDouble(conversionInfo.conversion_rates().cop());
    }

    public double convertUSDtoMXN(double amount) {
        return amount * Double.parseDouble(conversionInfo.conversion_rates().mxn());
    }

    public double convertMXNtoUSD(double amount) {
        return amount / Double.parseDouble(conversionInfo.conversion_rates().mxn());
    }

}
