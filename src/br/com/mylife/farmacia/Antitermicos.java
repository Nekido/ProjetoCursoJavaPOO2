package br.com.mylife.farmacia;

public class Antitermicos extends Medicamento implements Aplicacao{

    private String administracao = "gotas";

    public Antitermicos(String nome, String validade, TipoRemedioEnum tipo, String indicacao,

                        Integer quantidade, String laboratorio, String gotas) {
        super(nome, validade, tipo, indicacao, quantidade, laboratorio);
        this.administracao = administracao;
    }

    public String getAdministracao() {
        return administracao;
    }

    public void setAdministracao(String administracao) {
        this.administracao = administracao;
    }

    @Override
    public String toString() {
        return super.toString()+"Antitermicos{" +
                "gotas=" + administracao +
                '}';
    }

    @Override
    public void aplicacao() {
        System.out.println("Este medicamento é " + administracao);
    }
}
