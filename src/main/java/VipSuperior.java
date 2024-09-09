public class VipSuperior extends Vip {
  private double valorAdicional;

  public VipSuperior(double taxaAdicional, double valorAdicional) {
    super(taxaAdicional);
    this.valorAdicional = valorAdicional;
  }

  public double getValorFinal() {
    return super.getValorFinal() + this.valorAdicional;

  }
}
