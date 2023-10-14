package vn.edu.iuh.fit.models;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Entity
@Setter
public class Address {
    @Id
    @Column(name = "add_id")
    private long addId;
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
                "add_id=" + addId +
                ", country=" + country +
                ", zipcode='" + zipCode + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
