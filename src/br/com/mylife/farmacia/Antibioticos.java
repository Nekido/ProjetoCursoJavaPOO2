package br.com.mylife.farmacia;

public class Antibioticos extends Medicamento implements Aplicacao{



    public Antibioticos(String nome, String validade, TipoRemedioEnum tipo, String indicacao,
                        Integer quantidade, String laboratorio) {
        super(nome, validade, tipo, indicacao, quantidade, laboratorio);

    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void aplicacao() {
        System.out.println("Antiiótico: Este medicamento é Injetável");
    }
}
