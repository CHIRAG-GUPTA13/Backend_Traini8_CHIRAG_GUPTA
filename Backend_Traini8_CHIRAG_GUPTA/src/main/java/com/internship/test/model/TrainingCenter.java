package com.internship.test.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String centerName;

    @NotNull
    private String centerCode;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)           //one-to-one relation with address entity
    @JoinColumn(name = "address_id", referencedColumnName = "id", nullable = false)
    private Address address;

    @NotNull
    private Integer studentCapacity;

    @NotNull
    @ElementCollection
    private List<String> coursesOffered;            // list of course using Element Collection

    @NotNull
    private Long createdOn;

    @NotNull
    private String contactEmail;

    @NotNull
    private String contactPhone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotNull String getCenterName() {
        return centerName;
    }

    public void setCenterName(@NotNull String centerName) {
        this.centerName = centerName;
    }

    public @NotNull String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(@NotNull String centerCode) {
        this.centerCode = centerCode;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public @NotNull Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(@NotNull Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public @NotNull List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(@NotNull List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public @NotNull long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(@NotNull Long createdOn) {
        this.createdOn = createdOn;
    }

    public @NotNull String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@NotNull String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public @NotNull String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(@NotNull String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
