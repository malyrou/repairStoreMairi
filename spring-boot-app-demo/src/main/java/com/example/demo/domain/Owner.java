package com.example.demo.domain;

import javax.persistence.*;
import java.util.List;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "OWNER", uniqueConstraints = {@UniqueConstraint(columnNames = {"firstname", "lastname"})})
public class Owner {
    private static final int MAX_NAME_LENGTH  = 60;
    private static final int MAX_VAT_LENGTH  = 9;
    private static final int MAX_PLATE_NUMBER_LENGTH  = 8;

    @Id
    @Column(name = "owner_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "firstname", length = MAX_NAME_LENGTH)
    private String firstName;

    @Column(name = "lastname", length = MAX_NAME_LENGTH)
    private String lastName;

    @Column(name = "vat", length = MAX_VAT_LENGTH)
    private String vat;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "plate_number", length = MAX_PLATE_NUMBER_LENGTH)
    private String plateNumber;

    @Column(name = "brand")
    private String brand;


    //@OneToMany(mappedBy = "owner", targetEntity = Repair.class)
    //private List<Repair> repairs;

    public Owner(String firstName, String lastName, String vat, String email, String address, String plateNumber, String brand ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vat = vat;
        this.email = email;
        this.address = address;
        this.plateNumber = plateNumber;
        this.brand = brand;
        //this.repairs = repairs;
    }

    public Owner() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   /* public List<Repair> getRepairs() {
        return repairs;
    }

    public void setRepairs(List<Repair> repairs) {
        this.repairs =repairs;
    }*/

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Owner{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", vat='").append(vat).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", address='").append(address).append('\'');
        sb.append(", plateNumber='").append(plateNumber).append('\'');
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }




}








