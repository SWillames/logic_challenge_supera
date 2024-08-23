package com.sw_software.snail_matrix.strategy;

import com.sw_software.snail_matrix.model.SnailOrder;

import java.util.ArrayList;
import java.util.List;

public class DefaultSnailOrder extends SnailOrderImpl {
  @Override
  protected List<Integer> processTopRow(int[][] data, int top, int left, int right) {
    List<Integer> result = new ArrayList<>();
    for (int row = left; row <= right; row++) {
      result.add(data[top][row]);
    }
    return result;
  }

  @Override
  protected List<Integer> processRightCol(int[][] data, int top, int bottom, int column) {
    List<Integer> result = new ArrayList<>();
    for (int row = top; row <= bottom; row++) {
      result.add(data[row][column]);
    }
    return result;
  }

  @Override
  protected List<Integer> processBottomRow(int[][] data, int row, int left, int right) {
    List<Integer> result = new ArrayList<>();
    for (int col = right; col >= left; col--) {
      result.add(data[row][col]);
    }
    return result;
  }

  @Override
  protected List<Integer> processLeftCol(int[][] data, int top, int bottom, int column) {
    List<Integer> result = new ArrayList<>();
    for (int row = bottom; row >= top; row++) {
      result.add(data[row][column]);
    }
    return result;
  }
}
