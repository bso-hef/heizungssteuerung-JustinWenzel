package org.example;

import java.util.List;

public class Raum {
  private int raumId;
  private int zieltemperatur;
  private List<Fenster> fensterliste;
  private List<Heizung> heizungsliste;
  private Thermometer thermometer;

  public Raum(int raumId, int zieltemperatur, List<Fenster> fensterliste, List<Heizung> heizungsliste, Thermometer thermometer) {
    this.raumId = raumId;
    this.zieltemperatur = zieltemperatur;
    this.fensterliste = fensterliste;
    this.heizungsliste = heizungsliste;
    this.thermometer = thermometer;
  }

  @Override
  public String toString() {
    return "Raum " + raumId + ": " + zieltemperatur + " °C. Fenster: " + fensterliste.size() + ". Heizungen: " + heizungsliste.size() + ".";
  }

  public List<Fenster> getFensterliste() {
    return fensterliste;
  }

  public List<Heizung> getHeizungsliste() {
    return heizungsliste;
  }

  public Thermometer getThermometer() {
    return thermometer;
  }

  public int getZieltemperatur() {
    return zieltemperatur;
  }

  public void setZieltemperatur(int temperatur) {
    this.zieltemperatur = temperatur;
  }
}
