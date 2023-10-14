package vn.edu.iuh.fit.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Address {
    @Id
    private long addId;
    private int country;
    private String zipCode;
    private String city;
    private String street;


    public Address() {
    }

    public Address(long add_id, int country, String zipcode, String city, String street) {
        this.addId = add_id;
        this.country = country;
        this.zipCode = zipcode;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "address{" +
                "add_id=" + addId +
                ", country=" + country +
                ", zipcode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
