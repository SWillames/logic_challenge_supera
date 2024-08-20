package com.sw_software;

import java.util.HashMap;
import java.util.Map;

public class ColorCodeResistor {
  public static String resistorColors(String resitorValue){
    Map<Integer, String> codeColors = new HashMap<>();
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

    String[] parts = resitorValue.split(" ");
    String value = parts[0];

    double numericValue;
    if(value.contains("k")){
      numericValue = Double.parseDouble(value.replace("k","")) * 1000;
    }else if(value.contains("M")){
      numericValue = Double.parseDouble(value.replace("M","")) * 1000000;
    } else {
      numericValue = Double.parseDouble(value);
    }

    int intValue = (int) numericValue;
    String digits = String.valueOf(intValue);

    if(digits.length() == 1){
      digits = "0" + digits;
    }

    int firstDigit = Character.getNumericValue(digits.charAt(0));
    int secondDigit = Character.getNumericValue(digits.charAt(1));
    int multiplier = digits.length() - 2;

    String sequenceColor = codeColors.get(firstDigit) +
                           " " + codeColors.get(secondDigit) +
                           " " + codeColors.get(multiplier) +
                           " " + "dourado";

    return sequenceColor;
  }

  public static void main(String[] args) {
    System.out.println(resistorColors("10 ohms"));
    System.out.println(resistorColors("100 ohms"));
    System.out.println(resistorColors("220 ohms"));
    System.out.println(resistorColors("330 ohms"));
    System.out.println(resistorColors("470 ohms"));
    System.out.println(resistorColors("680 ohms"));
    System.out.println(resistorColors("1k ohms"));
    System.out.println(resistorColors("2M ohms"));
  }
}