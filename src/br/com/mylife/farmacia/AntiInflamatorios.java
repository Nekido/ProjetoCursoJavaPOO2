package br.com.mylife.farmacia;

public class AntiInflamatorios extends Medicamento implements Aplicacao{

  private String administracao= "viaOral";


  public AntiInflamatorios(String nome, String validade, TipoRemedioEnum tipo, String indicacao, Integer quantidade,
                           String laboratorio, String administracao) {
    super(nome, validade, tipo, indicacao, quantidade, laboratorio);
    this.administracao = administracao;
  }

  public String getAdministracao() {
    return administracao;
  }

  public void setAdministracao
          (String viaOral) {
    this.administracao = viaOral;
  }

  @Override
  public String toString() {
    return super.toString() +"AntiInflamatorios{" +
            "viaOral=" + administracao +
            '}';
  }

  @Override
  public void aplicacao() {
    System.out.println("Este medicamento é " + administracao);
  }
}

