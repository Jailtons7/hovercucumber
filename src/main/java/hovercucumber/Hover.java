package hovercucumber;

public class Hover {
  private Plato plato;
  private int coordenadaX;
  private int coordenadaY;
  private String direcao;

  Hover(int coordenadaX, int coordenadaY, String direcao, Plato plato) {
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
    this.direcao = direcao;
    this.plato = plato;
  }

  public int getCoordenadaX() {
    return this.coordenadaX;
  }

  public void setCoordenadaX (int coordenadaX) {
    if (coordenadaX >= 0 & coordenadaX <= this.getPlato().getCoordenadaX()) {
      this.coordenadaX = coordenadaX;
    }
  }

  public int getCoordenadaY() {
    return this.coordenadaY;
  }

  public void setCoordenadaY (int coordenadaY) {
    if ( coordenadaY >= 0 & coordenadaY <= this.getPlato().getCoordenadaY()) {
      this.coordenadaY = coordenadaY;
    }
  }

  public String getDirecao() {
    return this.direcao;
  }

  public void setDirecao (String direcao) {
    this.direcao = direcao;
  }

  public Plato getPlato() {
    return this.plato;
  }

  public void setPlato (Plato plato) {
    this.plato = plato;
  }

  public void move(String expressao) {

    for (int i = 0; i < expressao.length(); i++) {
      if (expressao.charAt(i) == 'L') {
        if (this.getDirecao() == "N") {
          this.setDirecao("O");
        } else if (this.getDirecao() == "O") {
          this.setDirecao("S");
        } else if (this.getDirecao() == "S") {
          this.setDirecao("L");
        } else if (this.getDirecao() == "L") {
          this.setDirecao("N");
        } else {
          System.out.println("Direção inválida na expressão");
        }
      } else if (expressao.charAt(i) == 'R') {
        if (this.getDirecao() == "N") {
          this.setDirecao("L");
        } else if (this.getDirecao() == "L") {
          this.setDirecao("S");
        } else if (this.getDirecao() == "S") {
          this.setDirecao("O");
        } else if (this.getDirecao() == "O") {
          this.setDirecao("N");
        } else {
          System.out.println("Direção inválida na expressão");
        }
      } else if (expressao.charAt(i) == 'M') {
        if (this.getDirecao() == "N") {
          this.setCoordenadaY(this.getCoordenadaY() + 1);
        } else if (this.getDirecao() == "S") {
          this.setCoordenadaY(this.getCoordenadaY() - 1);
        } else if (this.getDirecao() == "L") {
          this.setCoordenadaX(this.getCoordenadaX() + 1);
        } else if (this.getDirecao() == "O") {
          this.setCoordenadaX(this.getCoordenadaX() - 1);
        } else {
          System.out.println("Direção inválida na expressão");
        }
      }
    }
  }

  public String posicaoAtual() {
    return "" + this.coordenadaX + " " + this.coordenadaY + " " + this.direcao;
  }

}
