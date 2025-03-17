package com.internship.test.request;


import jakarta.validation.constraints.*;
import java.util.List;

public class TrainingCenterRequest {

    @NotBlank(message = " CENTER NAME can not be null")
    @Size(max = 40, message = "Center name must be less than 40 characters")
    private String centerName;

    @NotBlank(message = " CENTER CODE can not be null")
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters")
    private String centerCode;

    @NotNull(message = " ADDRESS can not be null")
    private AddressRequest address;

    @NotNull(message = " STUDENT CAPACITY can not be null")
    @Min(value = 1, message = "Student capacity must be at least 1")
    private Integer studentCapacity;

    @NotNull(message = " COURSE OFFERED LIST can not be null")
    @Size(min = 1, message = "At least one course must be offered")
    private List<String> coursesOffered;

    @Email(message = " Invalid email format")
    private String contactEmail;

    @NotNull(message = " CONTACT PHONE can not be null")
    @Pattern(regexp = "^[0-9]{10}$", message = "Contact phone must be a 10-digit number")
    private String contactPhone;

    public @NotNull(message = " CENTER NAME can not be null") @Size(max = 40, message = "Center name must be less than 40 characters") String getCenterName() {
        return centerName;
    }

    public void setCenterName(@NotNull(message = " CENTER NAME can not be null") @Size(max = 40, message = "Center name must be less than 40 characters") String centerName) {
        this.centerName = centerName;
    }

    public @NotNull(message = " CENTER CODE can not be null") @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters") String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(@NotNull(message = " CENTER CODE can not be null") @Pattern(regexp = "^[a-zA-Z0-9]{12}$", message = "Center code must be exactly 12 alphanumeric characters") String centerCode) {
        this.centerCode = centerCode;
    }

    public @NotNull(message = " ADDRESS can not be null") AddressRequest getAddress() {
        return address;
    }

    public void setAddress(@NotNull(message = " ADDRESS can not be null") AddressRequest address) {
        this.address = address;
    }

    public @NotNull(message = " STUDENT CAPACITY can not be null") @Min(value = 1, message = "Student capacity must be at least 1") Integer getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(@NotNull(message = " STUDENT CAPACITY can not be null") @Min(value = 1, message = "Student capacity must be at least 1") Integer studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public @NotNull(message = " COURSE OFFERED LIST can not be null") @Size(min = 1, message = "At least one course must be offered") List<String> getCoursesOffered() {
        return coursesOffered;
    }

    public void setCoursesOffered(@NotNull(message = " COURSE OFFERED LIST can not be null") @Size(min = 1, message = "At least one course must be offered") List<String> coursesOffered) {
        this.coursesOffered = coursesOffered;
    }

    public @Email(message = " Invalid email format") String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(@Email(message = " Invalid email format") String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public @NotNull(message = " CONTACT PHONE can not be null") @Pattern(regexp = "^[0-9]{10}$", message = "Contact phone must be a 10-digit number") String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(@NotNull(message = " CONTACT PHONE can not be null") @Pattern(regexp = "^[0-9]{10}$", message = "Contact phone must be a 10-digit number") String contactPhone) {
        this.contactPhone = contactPhone;
    }
}
