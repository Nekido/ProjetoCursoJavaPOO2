package br.com.mylife.farmacia;

public class AntiInflamatorios extends Medicamento implements Estocavel{

  private boolean viaOral;


  public AntiInflamatorios(String nome, String validade, TipoRemedioEnum tipo, String indicacao, Integer quantidade,
                           String laboratorio, boolean viaOral) {
    super(nome, validade, tipo, indicacao, quantidade, laboratorio);
    this.viaOral = viaOral;
  }

  public boolean isViaOral() {
    return viaOral;
  }

  public void setViaOral(boolean viaOral) {
    this.viaOral = viaOral;
  }

  @Override
  public String toString() {
    return super.toString() +"AntiInflamatorios{" +
            "viaOral=" + viaOral +
            '}';
  }

  @Override
  public void cadastro() {
    Estocavel.super.cadastro();
  }
}

