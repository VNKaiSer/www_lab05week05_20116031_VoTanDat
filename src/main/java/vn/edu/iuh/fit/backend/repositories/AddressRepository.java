package vn.edu.iuh.fit.backend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.backend.models.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {}
