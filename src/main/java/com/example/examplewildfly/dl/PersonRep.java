package com.example.examplewildfly.dl;

import com.example.examplewildfly.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRep extends JpaRepository<Person,Long> {
}
