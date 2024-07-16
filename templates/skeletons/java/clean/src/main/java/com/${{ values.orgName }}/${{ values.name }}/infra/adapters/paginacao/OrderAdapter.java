package com.${{ values.orgName }}.${{ values.name }}.infra.adapters.paginacao;

import org.springframework.data.domain.Sort.Order;

import com.${{ values.orgName }}.${{ values.name }}.core.utils.page.EDirection;
import com.${{ values.orgName }}.${{ values.name }}.core.utils.page.IOrder;

public class OrderAdapter implements IOrder{

  private final Order order;

  public OrderAdapter(Order order) {
    this.order = order;
  }

  @Override
  public EDirection getDirection() {
    return EDirection.valueOf(this.order.getDirection().name());
  }

  @Override
  public String getProperty() {
    return this.order.getProperty();
  }

}
