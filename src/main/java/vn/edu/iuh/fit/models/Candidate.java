package vn.edu.iuh.fit.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
public class Candidate {
    @Id
    private long can_id;
    private Date dob;
    @OneToOne
    @JoinColumn(name = "add_id")
    private Address address;
    private String phone;
    private String email;
    private String full_name;
    @OneToMany
    @JoinColumn(name = "can_id")
    private List<CandidateSkill> candidateSkills;
    public Candidate() {
    }

    public Candidate(long can_id, Date dob, Address address, String phone, String email, String full_name) {
        this.can_id = can_id;
        this.dob = dob;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.full_name = full_name;
    }

    public long getCan_id() {
        return can_id;
    }

    public void setCan_id(long can_id) {
        this.can_id = can_id;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public String toString() {
        return "job{" +
                "can_id=" + can_id +
                ", dob=" + dob +
                ", address=" + address +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", full_name='" + full_name + '\'' +
                '}';
    }
}
