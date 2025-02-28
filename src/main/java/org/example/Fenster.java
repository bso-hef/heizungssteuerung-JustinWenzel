package org.example;

public class Fenster {
  private boolean offen;
  private Raum raum;

  public Fenster(Raum raum) {
    this.raum = raum;
    this.offen = false; // Standardmäßig geschlossen
  }

  public void oeffneFenster() {
    this.offen = true;
  }

  public void schliesseFenster() {
    this.offen = false;
  }

  public boolean isOffen() {
    return offen;
  }

  public Raum getRaum() {
    return raum;
  }
}
