package com.kasiDemos.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kasiDemos.DMS.Models.Dog;
/**
*
* @author Kasi viswanath Nukala
*/
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);
}

