package br.com.mylife.farmacia;

public class Antibioticos extends Medicamentos {

    private boolean indicacaoVirose;
    private String aplicacao;

    public Antibioticos(String nome, String validade, Integer quantidade,
                        String laboratorio, boolean indicacaoVirose) {
        super(nome, validade,quantidade, laboratorio);
        this.indicacaoVirose = indicacaoVirose;
    }

    public boolean isIndicacaoVirose() {
        return indicacaoVirose;
    }

    public void setIndicacaoVirose(boolean indicacaoVirose) {
        this.indicacaoVirose = indicacaoVirose;
    }

    @Override
    public String toString() {
        return "Antibioticos{" +
                "indicacaoVirose=" + indicacaoVirose +
                super.toString();

    }
}
