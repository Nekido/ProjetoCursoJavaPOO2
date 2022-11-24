package br.com.mylife.farmacia;

public class Antitermicos extends Medicamento implements Aplicacao{



    public Antitermicos(String nome, String validade, TipoRemedioEnum tipo, String indicacao,

                        Integer quantidade, String laboratorio) {
        super(nome, validade, tipo, indicacao, quantidade, laboratorio);

    }


    @Override
    public String toString() {
        return super.toString()+"Antitermicos{" +
                '}';
    }

    @Override
    public void aplicacao() {
        System.out.println("Este medicamento é em Gotas");
    }
}
