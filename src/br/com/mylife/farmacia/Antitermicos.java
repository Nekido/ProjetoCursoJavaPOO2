package br.com.mylife.farmacia;

public class Antitermicos extends Medicamentos{

    private boolean indicacaoFebre;

    public Antitermicos(String nome, int validade, Integer quantidade,
                        String laboratorio, boolean indicacaoFebre) {
        super(nome, validade, quantidade, laboratorio);
        this.indicacaoFebre = indicacaoFebre;
    }

    public boolean isIndicacaoFebre() {
        return indicacaoFebre;
    }

    public void setIndicacaoFebre(boolean indicacaoFebre) {
        this.indicacaoFebre = indicacaoFebre;
    }

    @Override
    public String toString() {
        return "Antitermicos{" +
                "indicacaoFebre=" + indicacaoFebre +
                super.toString();

    }
}
