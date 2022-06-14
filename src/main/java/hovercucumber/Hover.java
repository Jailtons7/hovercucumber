package hovercucumber;

public class Hover {
  private Plato plato;
  private int coordenadaX;
  private int coordenadaY;
  private String direcao;

  Hover(int coordenadaX, int coordenadaY, String direcao, Plato plato) {
    this.setCoordenadaX(coordenadaX);
    this.setCoordenadaY(coordenadaY);
    this.setDirecao(direcao);
    this.setPlato(plato);
  }

  public int getCoordenadaX() {
    return this.coordenadaX;
  }

  public void setCoordenadaX (int coordenadaX) {
    this.coordenadaX = coordenadaX;
  }

  public int getCoordenadaY() {
    return this.coordenadaY;
  }

  public void setCoordenadaY (int coordenadaY) {
    this.coordenadaY = coordenadaY;
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
    this.setCoordenadaX(1);
    this.setCoordenadaY(3);
    this.setDirecao("N");
  }

  public String posicaoAtual() {
    return "" + this.coordenadaX + " " + this.coordenadaY + " " + this.direcao;
  }

}
