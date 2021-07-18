package com.manuanand.readmore;

import org.springframework.data.repository.CrudRepository;

import com.manuanand.readmore.Reader;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface ReaderRepository extends CrudRepository<Reader, Integer> {

}
