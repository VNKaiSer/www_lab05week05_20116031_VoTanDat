package vn.edu.iuh.fit.services;

import vn.edu.iuh.fit.models.Candidate;

import java.util.List;
import java.util.Optional;

public interface ParentService<T> {
    List<T> getAll();

    void save(T obj);

    void delete(T id);

    Optional<T> findById(Long id);
}
