package org.example.Common;

public class CalculationResult {
    private Double result;
    private String error;

    public CalculationResult(Double result, String error) {
        this.result = result;
        this.error = error;
    }

    public Double getResult() {
        return result;
    }

    public String getError() {
        return error;
    }

    public boolean isValid() {
        return error == null;
    }

}
