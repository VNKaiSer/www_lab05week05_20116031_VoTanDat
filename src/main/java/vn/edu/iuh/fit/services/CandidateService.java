package vn.edu.iuh.fit.services;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.models.Candidate;

public interface CandidateService extends ParentService<Candidate> {
    Page<Candidate> findAll(int pageNo, int pageSize, String sortBy,
                            String sortDirection);
}