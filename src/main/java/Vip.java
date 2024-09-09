
public class Vip extends IngressoNormal {
  private double taxaAdicional;

  public Vip(double taxaAdicional) {
    super();
    this.taxaAdicional = taxaAdicional;
  }

  public double getValorFinal() {
    return super.getValorFinal() * this.taxaAdicional + super.getValorFinal();

  }

}
