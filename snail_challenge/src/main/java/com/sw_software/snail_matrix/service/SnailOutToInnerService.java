package com.sw_software.snail_matrix.service;

import com.sw_software.snail_matrix.model.Matrix;
import com.sw_software.snail_matrix.model.SnailOrder;

import java.util.List;

public class SnailOutToInnerService {
  private final SnailOrder orderStrategy;

  public SnailOutToInnerService(SnailOrder orderStrategy) {
    this.orderStrategy = orderStrategy;
  }

  public List<Integer> getSpiralOrder(Matrix matrix) {
    return orderStrategy.getSnailOrder(matrix);
  }
}
