public class IngressoNormal {
  private int num;
  private static final double valor = 200;
  private static int proximoNumero = 1000;

  public IngressoNormal() {
    this.num = proximoNumero;
    proximoNumero += 10;
  }

  public int getNum() {
    return this.num;
  }

  public double getValorFinal() {
    return valor;
  }
}
