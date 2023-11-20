package vn.edu.iuh.fit.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import vn.edu.iuh.fit.models.Candidate;
@Repository
public interface CandidateRepository extends CrudRepository<Candidate, Long>{

}