package vn.edu.iuh.fit.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class address {
    @Id
    private long add_id;
    private int country;
    private String zipcode;
    private String city;
    private String street;

    public long getAdd_id() {
        return add_id;
    }

    public void setAdd_id(long add_id) {
        this.add_id = add_id;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public address() {
    }

    public address(long add_id, int country, String zipcode, String city, String street) {
        this.add_id = add_id;
        this.country = country;
        this.zipcode = zipcode;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "address{" +
                "add_id=" + add_id +
                ", country=" + country +
                ", zipcode='" + zipcode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
