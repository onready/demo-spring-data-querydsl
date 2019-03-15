package com.onready.demospringdataquerydsl.service;

import com.onready.demospringdataquerydsl.domain.Person;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PersonService {

  Page<Person> findAll(Predicate predicate, Pageable pageable);

}
