package com.waes.comparator.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.waes.comparator.entity.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long>  {

	/**
	 * 
	 * Method will find the document by its ID.
	 *
	 * @author <a href="mailto:jaderdeandrade@gmail.com">Jader T. Andrade</a>.
	 * @param id
	 * @return
	 * Document
	 */
	Document findById(long id);
}