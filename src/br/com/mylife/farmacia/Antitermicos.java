package br.com.mylife.farmacia;

public class Antitermicos extends Medicamento {

    private boolean gotas;

    public Antitermicos(String nome, String validade, TipoRemedioEnum tipo, String indicacao, Integer quantidade, String laboratorio, boolean gotas) {
        super(nome, validade, tipo, indicacao, quantidade, laboratorio);
        this.gotas = gotas;
    }

    public boolean isGotas() {
        return gotas;
    }

    public void setGotas(boolean gotas) {
        this.gotas = gotas;
    }

    @Override
    public String toString() {
        return super.toString()+"Antitermicos{" +
                "gotas=" + gotas +
                '}';
    }
}
