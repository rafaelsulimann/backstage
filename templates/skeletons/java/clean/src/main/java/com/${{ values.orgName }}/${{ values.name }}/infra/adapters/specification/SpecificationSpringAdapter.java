package com.${{ values.orgName }}.${{ values.name }}.infra.adapters.specification;

import org.springframework.data.jpa.domain.Specification;

import com.${{ values.orgName }}.${{ values.name }}.core.utils.specification.ISpecification;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class SpecificationSpringAdapter<T> implements Specification<T>{

  private final ISpecification<T> specification;

  public SpecificationSpringAdapter(ISpecification<T> specification) {
    this.specification = specification;
  }

  @Override
  public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
    return this.specification.toPredicate(root, query, criteriaBuilder);
  }

}
