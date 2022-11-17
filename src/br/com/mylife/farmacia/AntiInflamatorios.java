package br.com.mylife.farmacia;

public class AntiInflamatorios extends Medicamentos{

  private boolean indicacaoDor;

  public AntiInflamatorios(String nome, String validade,
                           Integer quantidade, String laboratorio, boolean indicacaoDor) {
    super(nome, validade, quantidade, laboratorio);
    this.indicacaoDor = indicacaoDor;

  }
  public boolean isIndicacaoDor() {
    return indicacaoDor;
  }

  public void setIndicacaoDor(boolean indicacaoDor) {
    this.indicacaoDor = indicacaoDor;
  }


  @Override
  public String toString() {
    return "AntiInflamatorios{" +
            "indicacaoDor=" + indicacaoDor +
            super.toString();

  }
}
