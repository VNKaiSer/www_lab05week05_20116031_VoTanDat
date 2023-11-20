package vn.edu.iuh.fit.backend.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long canId;
    private LocalDate dob;

    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;

    private String phone;
    private String email;
    private String fullName;

    @OneToMany
    @JoinColumn(name = "can_id")
    private List<CandidateSkill> candidateSkills;
    public Candidate() {
    }

    public Candidate(String full_name, LocalDate dob, Address address, String phone, String email) {
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.fullName = full_name;
    }

}
