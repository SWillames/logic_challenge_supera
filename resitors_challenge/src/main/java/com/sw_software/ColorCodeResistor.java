package com.sw_software;

import java.util.HashMap;
import java.util.Map;

interface CodeColor{
  String getColor(int digit);
}

class CodeColorImpl implements CodeColor{
  private static final Map<Integer, String> codeColors = new HashMap<>();

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
  public String getColor(int digit) {
    return codeColors.get(digit);
  }
}

class Resistor{
  private final int value;
  private final CodeColor color;

  public Resistor(String resistorValue, CodeColor color) {
    String[] parts = resistorValue.split(" ");
    String value = parts[0];
    double numericValue;
    if(value.contains("k")){
      numericValue = Double.parseDouble(value.replace("k","")) * 1000;
    }else if(value.contains("M")){
      numericValue = Double.parseDouble(value.replace("M","")) * 1000000;
    } else {
      numericValue = Double.parseDouble(value.replace(" ohms", ""));
    }

    this.value = (int) numericValue;
    this.color = color;
  }


  public String getColor() {
    String digits = String.valueOf(value);

    if (digits.length() == 1) {
      digits += "0";
    }

    int firstDigit = Character.getNumericValue(digits.charAt(0));
    int secondDigit = Character.getNumericValue(digits.charAt(1));
    int multiplier = digits.length() - 2;

    return String.format("%s %s %s dourado",
             color.getColor(firstDigit),
             color.getColor(secondDigit),
             color.getColor(multiplier));
  }
}

public class ColorCodeResistor {
  public static void main(String[] args) {
    CodeColor codeColor = new CodeColorImpl();
    System.out.println(new Resistor("10 ohms", codeColor).getColor());
    System.out.println(new Resistor("100 ohms", codeColor).getColor());
    System.out.println(new Resistor("220 ohms", codeColor).getColor());
    System.out.println(new Resistor("330 ohms", codeColor).getColor());
    System.out.println(new Resistor("470 ohms", codeColor).getColor());
    System.out.println(new Resistor("680 ohms", codeColor).getColor());
    System.out.println(new Resistor("1k ohms", codeColor).getColor());
    System.out.println(new Resistor("2M ohms", codeColor).getColor());
  }
}