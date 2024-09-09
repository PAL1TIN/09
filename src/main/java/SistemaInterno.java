public class SistemaInterno {
  public VipSuperior geraIngresso(int tipoIngresso) {
    IngressoNormal ingresso = criaIngresso(tipoIngresso);
    StringBuilder str = new StringBuilder();
    if (ingresso == null) {
      return null;
    }
    str.append("Ingresso ");
    switch (tipoIngresso) {
      case 1:
        str.append("Normal ");
        break;
      case 2:
        str.append("Meia");
        break;
      case 3:
        str.append("Camarote Inferior");
        break;
      case 4:
        str.append("Camarote Superior");
        break;
    }
    str.append("\n")
       .append("numero:")
       .append(ingresso.getNum())
       .append("\n")
       .append("Valor: R$")
       .append(ingresso.getValorFinal());
    return (VipSuperior) ingresso; 
  }

  private IngressoNormal criaIngresso(int tipoIngresso) {
    switch (tipoIngresso) {
      case 1:
        return new VipSuperior(0.3, 50); // Corrigido: Criando um VipSuperior
      case 2:
        return new IngressoMeia();
      case 3:
        return new VipInferior(0.3);
      case 4:
        return new VipSuperior(0.3, 50);
      default:
        return null;
    }
  }
}