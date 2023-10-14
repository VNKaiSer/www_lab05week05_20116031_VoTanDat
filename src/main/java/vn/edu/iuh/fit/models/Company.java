package vn.edu.iuh.fit.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Company {
    @Id
    private long comId;
    @OneToOne
    @JoinColumn(name = "add_id", nullable = false)
    private Address address;
    private String about;
    private String compName;
    private String email;
    private String phone;
    private String webUrl;
    @OneToMany
    @JoinColumn(name = "job_id")
    private List<Job> jobs;


    public Company(long com_id, Address address, String about, String comp_name, String email, String phone, String web_url) {
        this.comId = com_id;
        this.address = address;
        this.about = about;
        this.compName = comp_name;
        this.email = email;
        this.phone = phone;
        this.webUrl = web_url;
    }

    public Company() {
    }

    @Override
    public String toString() {
        return "company{" +
                "id=" + comId +
                ", address=" + address +
                ", about='" + about + '\'' +
                ", comp_name='" + compName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", web_url='" + webUrl + '\'' +
                '}';
    }
}
