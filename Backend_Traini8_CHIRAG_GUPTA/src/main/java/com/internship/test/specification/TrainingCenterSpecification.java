package com.internship.test.specification;

import com.internship.test.model.TrainingCenter;
import org.springframework.data.jpa.domain.Specification;

public class TrainingCenterSpecification {
    public static Specification<TrainingCenter> hasCenterName(String centerName) {          //get center name that like
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("centerName")), "%" + centerName.toLowerCase() + "%");
    }

    public static Specification<TrainingCenter> hasCenterCode(String centerCode) {      //get data that has equal center code
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("centerCode"), centerCode);
    }

    public static Specification<TrainingCenter> hasDetailedAddress(String detailedAddress) {       // get data  that like detailed address
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("address").get("detailedAddress")), "%" + detailedAddress.toLowerCase() + "%");
    }

    public static Specification<TrainingCenter> hasCity(String city) {      //get data that has equal city
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(criteriaBuilder.lower(root.get("address").get("city")), city.toLowerCase());
    }

    public static Specification<TrainingCenter> hasState(String state) {       //get data that has equal state
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(criteriaBuilder.lower(root.get("address").get("state")), state.toLowerCase());
    }

    public static Specification<TrainingCenter> hasPincode(String pincode) {       //get data that has equal pincode
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("address").get("pinCode"), pincode);
    }

    public static Specification<TrainingCenter> hasStudentCapacity(Integer studentCapacity) {    //get data that has equal student capacity
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("studentCapacity"), studentCapacity);
    }

    public static Specification<TrainingCenter> hasStudentCapacityGreaterThan(Integer studentCapacity) {  //get data that has greater student capacity
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("studentCapacity"), studentCapacity);
    }

    public static Specification<TrainingCenter> hasStudentCapacityLessThan(Integer studentCapacity) {   //get data that has less student capacity
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThan(root.get("studentCapacity"), studentCapacity);
    }

    public static Specification<TrainingCenter> hasCourseOffered(String course) {       // get data that contains specific course
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.isMember(course, root.get("coursesOffered"));
    }

    public static Specification<TrainingCenter> hasCreatedOn(Long createdOn) {      // get data with created on
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("createdOn"), createdOn);
    }

    public static Specification<TrainingCenter> hasCreatedOnGreaterThan(Long createdOn) {   // get data with grater than created on
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThan(root.get("createdOn"), createdOn);
    }

    public static Specification<TrainingCenter> hasCreatedOnLessThan(Long createdOn) {      // get data with grater less created on
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThan(root.get("createdOn"), createdOn);
    }

    public static Specification<TrainingCenter> hasContactEmail(String contactEmail) {      // get data that has like email
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.like(criteriaBuilder.lower(root.get("contactEmail")), "%" + contactEmail.toLowerCase() + "%");
    }

    public static Specification<TrainingCenter> hasContactPhone(String contactPhone) {      // get data that has qual phone number
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("contactPhone"), contactPhone);
    }
}
