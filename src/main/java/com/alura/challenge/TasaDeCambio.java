package com.alura.challenge;

import java.util.Map;

public class TasaDeCambio {
    private String codigoBase;
    private Map<String, Double> conversiones;

    public String getCodigoBase() {
        return codigoBase;
    }

    public void setCodigoBase(String codigoBase) {
        this.codigoBase = codigoBase;
    }

    public Map<String, Double> getConversiones() {
        return conversiones;
    }

    public void setConversiones(Map<String, Double> conversiones) {
        this.conversiones = conversiones;
    }

    public  Double getTasa(String codigoMoneda){
        return conversiones.get(codigoMoneda);
    }
}
