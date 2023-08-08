package com.udacity.graphql.Repo;

import com.udacity.graphql.Entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog,Long> {
}