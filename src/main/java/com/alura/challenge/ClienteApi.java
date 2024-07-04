package com.alura.challenge;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ClienteApi {
    private static final String URL_API = "https://v6.exchangerate-api.com/v6/8e30510ff051c2e04060b682/latest/USD";

    public TasaDeCambio obtenerTasas(String monedaBase) {
        try {
            URL url = new URL(URL_API + monedaBase);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            int responseCode = conn.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
                StringBuilder respueta = new StringBuilder();
                String entrada;

                while ((entrada = in.readLine()) != null) {
                    respueta.append(entrada);
                }
                in.close();

                Gson gson = new Gson();
                return gson.fromJson(respueta.toString(), TasaDeCambio.class);
            } else {
                System.out.println("La solicitud GET no fue exitosa");
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }
    }
}
