package br.com.ProjetoAlura.Objetos;

import com.google.gson.annotations.SerializedName;

public class CambioPrincipal {
    @SerializedName("base_code")
    public String baseCode;
    @SerializedName("target_code")
    public String targetCode;
    @SerializedName("conversion_result")
    public String conversionResult;

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getConversionResult() {
        return conversionResult;
    }

    public void setConversionResult(String conversionResult) {
        this.conversionResult = conversionResult;
    }

    @Override
    public String toString(){
        return "Moeda de entrada: " + baseCode +
                " Moeda visada: " + targetCode +
                " valor da conversão: " + conversionResult;
    }
}
