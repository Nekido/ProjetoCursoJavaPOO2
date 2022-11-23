package br.com.mylife.farmacia;

public class Antibioticos extends Medicamento {

    private boolean injetavel;

    public Antibioticos(String nome, String validade, TipoRemedioEnum tipo, String indicacao, Integer quantidade, String laboratorio, boolean injetavel) {
        super(nome, validade, tipo, indicacao, quantidade, laboratorio);
        this.injetavel = injetavel;
    }

    public boolean isInjetavel() {
        return injetavel;
    }

    public void setInjetavel(boolean injetavel) {
        this.injetavel = injetavel;
    }

    @Override
    public String toString() {
        return super.toString() +"Antibioticos{" +
                "injetavel=" + injetavel +
                '}';
    }


}
