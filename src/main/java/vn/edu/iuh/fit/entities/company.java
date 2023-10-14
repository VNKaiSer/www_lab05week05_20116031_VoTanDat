package vn.edu.iuh.fit.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class company {
    @Id
    private long com_id;
    @OneToOne
    @JoinColumn(name = "add_id", nullable = false)
    private address address;
    private String about;
    private String comp_name;
    private String email;
    private String phone;
    private String web_url;
    @OneToMany
    @JoinColumn(name = "job_id")
    private List<job> jobs;

    public long getId() {
        return com_id;
    }

    public void setId(long id) {
        this.com_id = id;
    }

    public vn.edu.iuh.fit.entities.address getAddress() {
        return address;
    }

    public void setAddress(vn.edu.iuh.fit.entities.address address) {
        this.address = address;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWeb_url() {
        return web_url;
    }

    public void setWeb_url(String web_url) {
        this.web_url = web_url;
    }

    public company(long com_id, vn.edu.iuh.fit.entities.address address, String about, String comp_name, String email, String phone, String web_url) {
        this.com_id = com_id;
        this.address = address;
        this.about = about;
        this.comp_name = comp_name;
        this.email = email;
        this.phone = phone;
        this.web_url = web_url;
    }

    public company() {
    }

    @Override
    public String toString() {
        return "company{" +
                "id=" + com_id +
                ", address=" + address +
                ", about='" + about + '\'' +
                ", comp_name='" + comp_name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", web_url='" + web_url + '\'' +
                '}';
    }
}
