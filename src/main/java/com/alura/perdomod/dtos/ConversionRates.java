package com.alura.perdomod.dtos;

import com.google.gson.annotations.SerializedName;

public record ConversionRates(
        @SerializedName("USD") String usd,
        @SerializedName("EUR") String eur,
        @SerializedName("CAD") String cad,
        @SerializedName("GBP") String gbp,
        @SerializedName("ARS") String ars,
        @SerializedName("MXN") String mxn,
        @SerializedName("COP") String cop) {
}