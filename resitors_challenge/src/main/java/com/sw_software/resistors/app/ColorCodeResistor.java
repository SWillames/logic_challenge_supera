package com.sw_software.resistors.app;

import com.sw_software.resistors.factory.ResistorFactory;
import com.sw_software.resistors.model.CodeColorImpl;
import com.sw_software.resistors.model.Resistor;

import java.util.Scanner;

public class ColorCodeResistor {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("Digite o valor da resistência:  ");
      String value = scanner.nextLine();

      try {
        Resistor resistor = ResistorFactory.createResistor(value, new CodeColorImpl());
        System.out.println("Código de cores: "+resistor.getCodeColor());
      } catch (IllegalArgumentException e) {
        System.out.println("Entrada inválida: "+e.getMessage());
        break;
      }
    }

    scanner.close();
  }
}