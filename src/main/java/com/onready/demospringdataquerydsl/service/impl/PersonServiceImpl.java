package com.onready.demospringdataquerydsl.service.impl;

import com.onready.demospringdataquerydsl.domain.Person;
import com.onready.demospringdataquerydsl.repository.PersonRepository;
import com.onready.demospringdataquerydsl.service.PersonService;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

  private final PersonRepository personRepository;

  @Override
  public Page<Person> findAll(Predicate predicate, Pageable pageable) {
    return personRepository.findAll(predicate, pageable);
  }

}
