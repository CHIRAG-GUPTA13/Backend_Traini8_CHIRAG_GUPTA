package com.internship.test.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Detailed address can't be null")
    private String detailedAddress;

    @NotNull(message = "City can't be null")
    private String city;

    @NotNull(message = "State can't be null")
    private String state;

    @NotNull(message = "Pin code can't be null")
    private String pinCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull(message = "Detailed address can't be null") String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(@NotNull(message = "Detailed address can't be null") String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public @NotNull(message = "City can't be null") String getCity() {
        return city;
    }

    public void setCity(@NotNull(message = "City can't be null") String city) {
        this.city = city;
    }

    public @NotNull(message = "State can't be null") String getState() {
        return state;
    }

    public void setState(@NotNull(message = "State can't be null") String state) {
        this.state = state;
    }

    public @NotNull(message = "Pin code can't be null") String getPinCode() {
        return pinCode;
    }

    public void setPinCode(@NotNull(message = "Pin code can't be null") String pinCode) {
        this.pinCode = pinCode;
    }
}
