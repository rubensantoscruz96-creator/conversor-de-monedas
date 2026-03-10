package com.pollorosa.convermonedas.modelo;

import com.google.gson.annotations.SerializedName;

public record ResponseConversor(
        @SerializedName("result") String result,
        @SerializedName("error-type") String error_type,
        @SerializedName("conversion_rate") double conversion_rate,
        @SerializedName("conversion_result") double conversion_result) {
}
