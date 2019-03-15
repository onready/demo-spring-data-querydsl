package com.onready.demospringdataquerydsl.controller.rest;

import com.onready.demospringdataquerydsl.domain.Person;
import com.onready.demospringdataquerydsl.service.PersonService;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
@RequiredArgsConstructor
public class PersonRestController {

  private final PersonService personService;

  @GetMapping
  Page<Person> findAll(@QuerydslPredicate(root = Person.class) Predicate predicate, Pageable pageable) {
    return personService.findAll(predicate, pageable);
  }

}
