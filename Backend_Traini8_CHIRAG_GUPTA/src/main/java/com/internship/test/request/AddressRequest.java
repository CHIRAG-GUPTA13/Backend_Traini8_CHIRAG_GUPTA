package com.internship.test.request;

import jakarta.validation.constraints.NotNull;

public class AddressRequest {

    @NotNull(message = "Detailed address can't be null")
    private String detailedAddress;

    @NotNull(message = "City can't be null")
    private String city;

    @NotNull(message = "State can't be null")
    private String state;

    @NotNull(message = "Pin code can't be null")
    private String pinCode;

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
