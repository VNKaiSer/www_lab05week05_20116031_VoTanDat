package vn.edu.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.models.Address;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {}
