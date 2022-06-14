package hovercucumber;

public class Plato {
  private int coordenadaX;
  private int coordenadaY;

  public Plato(int coordenadaX, int coordenadaY) {
    this.coordenadaX = coordenadaX;
    this.coordenadaY = coordenadaY;
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
}
