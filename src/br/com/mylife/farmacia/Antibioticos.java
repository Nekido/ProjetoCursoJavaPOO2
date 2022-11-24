package br.com.mylife.farmacia;

public class Antibioticos extends Medicamento implements Aplicacao{

    private String administracao= "injetavel";

    public Antibioticos(String nome, String validade, TipoRemedioEnum tipo, String indicacao,
                        Integer quantidade, String laboratorio, String injetavel) {
        super(nome, validade, tipo, indicacao, quantidade, laboratorio);
        this.administracao = administracao;
    }

    public String getInjetavel() {
        return administracao;
    }

    public void setAdministracao(String injetavel) {
        this.administracao = injetavel;
    }

    @Override
    public String toString() {
        return super.toString() +"Antibioticos{" +
                "injetavel=" + administracao +
                '}';
    }

    @Override
    public void aplicacao() {
        System.out.println("Este medicamento é " + administracao);
    }
}
