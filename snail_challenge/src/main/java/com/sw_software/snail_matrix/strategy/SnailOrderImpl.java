package com.sw_software.snail_matrix.strategy;

import com.sw_software.snail_matrix.model.Matrix;
import com.sw_software.snail_matrix.model.SnailOrder;

import java.util.ArrayList;
import java.util.List;

public abstract class SnailOrderImpl implements SnailOrder {

  @Override
  public final List<Integer> getSnailOrder(Matrix matrix) {
    int[][] data = matrix.getNumbers();
    if (data.length == 0 || data[0].length == 0 || data == null) {
      return new ArrayList<>();
    }

    List<Integer> result = new ArrayList<>();
    int top = 0, bottom = data.length - 1;
    int left = 0, right = data[0].length - 1;

    while (top <= bottom && left <= right) {
     for (int i = left; i <= right; i++) {
      result.add(data[top][i]);
     }
     top++;

     for (int i = top; i <= bottom; i++) {
       result.add(data[i][right]);
     }
     right--;

     if (top <= bottom) {
       for (int i = right; i >= left; i--) {
         result.add(data[bottom][i]);
       }
       bottom--;
     }

     if (left <= right) {
       for (int i = bottom; i >= top; i--) {
         result.add(data[i][left]);
       }
       left++;
     }
    }
    return result;
  }

  protected abstract List<Integer> processTopRow(int[][] data, int row, int left, int right);
  protected abstract List<Integer> processRightCol(int[][] data, int top, int bottom, int column);
  protected abstract List<Integer> processBottomRow(int[][] data, int row, int left, int right);
  protected abstract List<Integer> processLeftCol(int[][] data, int top, int bottom, int column);
}
