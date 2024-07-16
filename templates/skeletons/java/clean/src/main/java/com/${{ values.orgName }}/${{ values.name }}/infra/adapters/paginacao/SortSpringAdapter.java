package com.${{ values.orgName }}.${{ values.name }}.infra.adapters.paginacao;

import java.util.List;

import org.springframework.data.domain.Sort;

public class SortSpringAdapter extends Sort{

  protected SortSpringAdapter(List<Order> orders) {
    super(orders);
  }

}
