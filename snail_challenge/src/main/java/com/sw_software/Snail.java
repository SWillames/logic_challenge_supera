package com.sw_software;

import java.util.ArrayList;
import java.util.List;

public class Snail {

  public static List<Integer> listOuterToInner(int[][] matrix) {
    List<Integer> list = new ArrayList<>();

    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
      return list;
    }

    int top = 0, bottom = matrix.length - 1;
    int left = 0, right = matrix[0].length - 1;

    while (top <= bottom && left <= right) {
      for (int i = left; i <= right; i++) {
        list.add(matrix[top][i]);
      }
      top++;

      for (int i = top; i <= bottom; i++) {
        list.add(matrix[i][right]);
      }
      right--;

      if (top <= bottom) {
        for (int i = right; i >= left; i--) {
          list.add(matrix[bottom][i]);
        }
        bottom--;
      }

      if (left <= right) {
        for (int i = left; i >= top; i--) {
          list.add(matrix[i][left]);
        }
        left++;
      }
    }

    return list;
  }

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
    System.out.println(listOuterToInner(example1));
    System.out.println(listOuterToInner(example2));
  }
}