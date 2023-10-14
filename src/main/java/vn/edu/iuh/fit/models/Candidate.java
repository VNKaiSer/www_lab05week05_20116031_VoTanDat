package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Getter
@Entity
public class Candidate {
    @Id
    @Column(name = "can_id")
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



    public void setCanId(long can_id) {
        this.canId = can_id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFullName(String full_name) {
        this.fullName = full_name;
    }

    @Override
    public String toString() {
        return "job{" +
                "can_id=" + canId +
                ", dob=" + dob +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", full_name='" + fullName + '\'' +
                '}';
    }
}
