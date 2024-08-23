package com.sw_software.snail_matrix.app;

import com.sw_software.snail_matrix.model.Matrix;
import com.sw_software.snail_matrix.service.SnailOutToInnerService;
import com.sw_software.snail_matrix.strategy.DefaultSnailOrder;

public class Snail {
  public static void main(String[] args) {
    int[][] example1 = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
    };
    int[][] example2 = {
        {1, 2, 3},
        {4, 10, 12},
        {6, 7, 33}
    };
    Matrix matrix1 = new Matrix(example1);
    Matrix matrix2 = new Matrix(example2);

    SnailOutToInnerService service = new SnailOutToInnerService(new DefaultSnailOrder());

    System.out.println(service.getSpiralOrder(matrix1));
    System.out.println(service.getSpiralOrder(matrix2));
  }
}