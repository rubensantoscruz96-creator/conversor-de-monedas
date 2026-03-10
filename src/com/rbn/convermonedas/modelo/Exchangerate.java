package com.pollorosa.convermonedas.modelo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Exchangerate {
    private final HttpClient client;

    public Exchangerate() {
        this.client = HttpClient.newHttpClient();
    }

    public double convertir(String base, String target, double valor) throws IOException, InterruptedException {
        String url = "https://v6.exchangerate-api.com/v6/" + Constantes.API_KEY + "/pair/" +
                base.toUpperCase() + "/" + target.toUpperCase() + "/" + valor;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response = this.client
                .send(request, HttpResponse.BodyHandlers.ofString());
        String jsonResponse = response.body();

        Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .create();
        ResponseConversor responseConversor = gson.fromJson(jsonResponse, ResponseConversor.class);
        if(responseConversor.result().equals(Constantes.EXCHANGERATE_EXITO))
            return responseConversor.conversion_result();
        else {
            String mensaje = "";
            for(ExchangerateError er: Constantes.EXCHANGERATE_ERROR) {
                if(responseConversor.error_type().equals(er.getCodigo()))
                    mensaje = er.getDetalle();
            }
            throw new ExchangerateException(responseConversor.error_type(), mensaje);
        }
    }
}
