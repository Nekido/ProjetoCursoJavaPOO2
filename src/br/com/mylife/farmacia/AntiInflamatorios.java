package br.com.mylife.farmacia;

public class AntiInflamatorios extends Medicamento implements Aplicacao{




  public AntiInflamatorios(String nome, String validade, TipoRemedioEnum tipo, String indicacao, Integer quantidade,
                           String laboratorio) {
    super(nome, validade, tipo, indicacao, quantidade, laboratorio);

  }

  @Override
  public String toString() {
    return super.toString() +"AntiInflamatorios{" +
            '}';
  }

  @Override
  public void aplicacao() {
    System.out.println("Antiinflamatório: Este medicamento é Via Oral");
  }
}

