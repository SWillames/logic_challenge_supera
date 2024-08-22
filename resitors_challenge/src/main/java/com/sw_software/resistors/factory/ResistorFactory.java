package com.sw_software.resistors.factory;

import com.sw_software.resistors.model.CodeColor;
import com.sw_software.resistors.model.Resistor;

public class ResistorFactory {

  public static Resistor createResistor(String value, CodeColor codeColor) {
    int resistorValue = resistanceToValue(value);
    return new Resistor(resistorValue, codeColor);
  }

  public static int resistanceToValue(String value) {
    value = value.toLowerCase().replace(" ohms", "");
    if (value.endsWith("k")) {
      return (int) (Double.parseDouble(value.replace("k", "")) * 1000);
    } else if (value.endsWith("m")) {
      return (int) (Double.parseDouble(value.replace("m", "")) * 1000000);
    } else {
      return Integer.parseInt(value);
    }
  }
}
