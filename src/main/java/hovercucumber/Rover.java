package hovercucumber;

public class Rover {
  private Plato plato;
  private int coordenadaX;
  private int coordenadaY;
  private String direcao;

  Rover(int coordenadaX, int coordenadaY, String direcao, Plato plato) {
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

  public void girarEsquerda() {
    if (this.getDirecao().equals("N")) {
      this.setDirecao("O");
    } else if (this.getDirecao().equals("O")) {
      this.setDirecao("S");
    } else if (this.getDirecao().equals("S")) {
      this.setDirecao("L");
    } else if (this.getDirecao().equals("L")) {
      this.setDirecao("N");
    } else {
      System.out.println("Direção inválida na expressão");
    }
  }

  public void girarDireita() {
    if (this.getDirecao().equals("N")) {
      this.setDirecao("L");
    } else if (this.getDirecao().equals("L")) {
      this.setDirecao("S");
    } else if (this.getDirecao().equals("S")) {
      this.setDirecao("O");
    } else if (this.getDirecao().equals("O")) {
      this.setDirecao("N");
    } else {
      System.out.println("Direção inválida na expressão");
    }
  }

  public void move() {
    if (this.getDirecao().equals("N")) {
      this.setCoordenadaY(this.getCoordenadaY() + 1);
    } else if (this.getDirecao().equals("S")) {
      this.setCoordenadaY(this.getCoordenadaY() - 1);
    } else if (this.getDirecao().equals("L")) {
      this.setCoordenadaX(this.getCoordenadaX() + 1);
    } else if (this.getDirecao().equals("O")) {
      this.setCoordenadaX(this.getCoordenadaX() - 1);
    } else {
      System.out.println("Direção inválida na expressão");
    }
  }

  public void executarExpressao(String expressao) {
    for (int i = 0; i < expressao.length(); i++) {
      if (expressao.charAt(i) == 'L') {
        System.out.println("Girando pra esquerda");
        this.girarEsquerda();
      } else if (expressao.charAt(i) == 'R') {
        System.out.println("Girando pra direita");
        this.girarDireita();
      } else if (expressao.charAt(i) == 'M') {
        System.out.println("Movimentando o Rover");
        this.move();
      }
    }
  }

  public String posicaoAtual() {
    return "" + this.coordenadaX + " " + this.coordenadaY + " " + this.direcao;
  }

}
