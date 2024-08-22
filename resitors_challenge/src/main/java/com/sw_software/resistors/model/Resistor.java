package com.sw_software.resistors.model;

public class Resistor {

  private final int value;
  private final CodeColor codeColor;

  public Resistor(int value, CodeColor color) {
    this.value = value;
    this.codeColor = color;
  }

  public String getCodeColor() {
    return codeColor.getColor(value);
  }
}
