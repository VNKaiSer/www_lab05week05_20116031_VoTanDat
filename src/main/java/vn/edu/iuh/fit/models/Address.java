package vn.edu.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Address {
    @Id
    @Column(name = "add_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String number;
    private CountryCode country;
    private String zipCode;
    private String city;
    private String street;


    public Address() {
    }

    public Address(String number, String street, String city, String zipcode, CountryCode countryCode) {
        this.number = number;
        this.country = countryCode;
        this.zipCode = zipcode;
        this.city = city;
        this.street = street;
    }



    @Override
    public String toString() {
        return "address{" +
                "add_id=" + id +
                ", country=" + country +
                ", zipcode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
