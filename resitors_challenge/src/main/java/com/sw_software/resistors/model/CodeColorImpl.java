package com.sw_software.resistors.model;

import java.util.HashMap;
import java.util.Map;

public class CodeColorImpl implements CodeColor {

  private static final Map<Integer, String> codeColors = new HashMap<>();
  private static final String BAND_TOLERANCE = "dourado";

  static {
    codeColors.put(0, "preto");
    codeColors.put(1, "marrom");
    codeColors.put(2, "vermelho");
    codeColors.put(3, "laranja");
    codeColors.put(4, "amarelo");
    codeColors.put(5, "verde");
    codeColors.put(6, "azul");
    codeColors.put(7, "violeta");
    codeColors.put(8, "cinza");
    codeColors.put(9, "branco");
  }

  @Override
  public String getColor(int resistorValue) {
    StringBuilder codeColor = new StringBuilder();
    int firstDigit = Integer.parseInt(String.valueOf(resistorValue).substring(0, 1));
    int secondDigit = Integer.parseInt(String.valueOf(resistorValue).substring(1, 2));
    int multiplier = Integer.toString(resistorValue).length() - 2;

    codeColor.append(codeColors.get(firstDigit)).append(" ");
    codeColor.append(codeColors.get(secondDigit)).append(" ");
    codeColor.append(codeColors.get(multiplier)).append(" ");
    codeColor.append(BAND_TOLERANCE);

    return codeColor.toString();
  }
}
