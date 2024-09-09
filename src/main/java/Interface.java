import java.util.Scanner;

public class Interface {
  SistemaInterno sistema;

  public Interface() {
    this.sistema = new SistemaInterno();
  }

  public void iniciaOperacao() {
    int opcao;
    do {
      opcao = getOpcao();
      String ingresso = sistema.geraIngresso(opcao).toString(); // Corrigido
      if (ingresso == null) {
        System.out.println("ingresso nao gerado");
      } else {
        System.out.println(ingresso);
      }
    } while (opcao != 5);
  }

  private int getOpcao() {
    int opcao;
    do {
      opcao = getInt(
          "opcao: 1 - ingresso normal, 2 - meia entrada, 3 - Camarote Inferior, 4 - Camarote Superior, 5 - sair");
      // Use || (OR) instead of & (AND) for the conditional
      if (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5) {
        opcao = 0;
      }
    } while (opcao == 0);
    return opcao;
  }

  private int getInt(String string) {
    Scanner r = new Scanner(System.in);
    System.out.println(string);
    return r.nextInt();
  }
}