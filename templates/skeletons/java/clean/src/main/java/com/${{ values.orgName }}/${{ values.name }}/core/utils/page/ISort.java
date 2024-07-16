package com.${{ values.orgName }}.${{ values.name }}.core.utils.page;

import java.util.List;

public interface ISort {
  List<IOrder> getOrders();
  boolean isSorted();
  boolean isUnsorted();
  boolean isEmpty();
}
