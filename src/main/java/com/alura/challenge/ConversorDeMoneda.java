package com.alura.challenge;

public class ConversorDeMoneda {
    private ClienteApi clienteApi;

    public ConversorDeMoneda() {
        this.clienteApi = new ClienteApi();
    }

    public double convertirMoneda(double cantidad, String monedaOrigen, String monedaDestino){
        TasaDeCambio tasas = clienteApi.obtenerTasas(monedaOrigen);
        if (tasas != null) {
            Double tasa = tasas.getTasa(monedaDestino);
            if (tasa != null) {
                return cantidad * tasa;
            } else {
                System.out.println("No se encontró la tasa de cambio para " + monedaDestino);
                return -1;
            }
        }else{
            System.out.println("No se pudieron obtener las de cambio para " + monedaOrigen);
            return -1;
        }
    }
}
