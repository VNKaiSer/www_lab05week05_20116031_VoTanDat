package vn.edu.iuh.fit.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.services.ParentService;

import java.util.List;
import java.util.Optional;
//@Service
public class ParentServiceImpl<T> implements ParentService<T> {
    protected ParentService<T> service;
    @Override
    public List<T> getAll() {
        return service.getAll();
    }

    @Override
    public void save(T obj) {
        service.save(obj);
    }

    @Override
    public void delete(T id) {
        service.delete(id);
    }

    @Override
    public Optional<T> findById(Long id) {
        return service.findById(id);
    }
}
