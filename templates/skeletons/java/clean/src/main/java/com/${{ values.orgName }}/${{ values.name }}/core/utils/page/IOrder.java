package com.${{ values.orgName }}.${{ values.name }}.core.utils.page;

public interface IOrder {
  EDirection getDirection();
  String getProperty();
}
