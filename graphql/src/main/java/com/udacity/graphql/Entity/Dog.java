package com.udacity.graphql.Entity;

import jakarta.persistence.*;

@Entity
public class Dog {
    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String breed;
    private String origin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}

//
//    type Dog {
//        Id: ID!
//        name: String!
//        breed: String!
//        origin: String!
//        }

//    type Dog {
//        Id: ID!
//        name: String!
//        breed: String!
//        origin: String!
//        }
//
//        findDogBreeds
//        findDogBreedById
//        findAllDogNames
//
//        type Query {
//        findAllDogs: [Dog]!
//        }
//
//        type Mutation {
//        newDog(name: String!, breed: String!, origin:String!) : Dog!
//        deleteLocation(id:ID!) : Boolean
//        updateLocationName(newName: String!, id:ID!) : Location!
//        }
