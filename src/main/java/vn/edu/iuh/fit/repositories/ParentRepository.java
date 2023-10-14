package vn.edu.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentRepository<T> extends CrudRepository<T, Long> { }
