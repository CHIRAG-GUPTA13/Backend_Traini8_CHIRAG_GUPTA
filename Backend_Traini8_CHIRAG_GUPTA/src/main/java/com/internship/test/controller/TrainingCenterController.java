package com.internship.test.controller;

import com.internship.test.model.TrainingCenter;
import com.internship.test.repository.TrainingCenterRepository;
import com.internship.test.request.TrainingCenterRequest;
import com.internship.test.response.ApiResponse;
import com.internship.test.service.TrainingCenter.ITrainingCenterService;
import com.internship.test.specification.TrainingCenterSpecification;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;


@RestController
@RequestMapping("/TrainingCenters")
public class TrainingCenterController {
    @Autowired
    private final ITrainingCenterService trainingCenterService;
    @Autowired
    private final TrainingCenterRepository trainingCenterRepository;

    public TrainingCenterController(ITrainingCenterService trainingCenterService, TrainingCenterRepository trainingCenterRepository) {
        this.trainingCenterService = trainingCenterService;
        this.trainingCenterRepository = trainingCenterRepository;
    }

    @PostMapping("/TrainingCenter/create")
    public ResponseEntity<ApiResponse> createTrainingCenter(@Valid @RequestBody TrainingCenterRequest request) {
        try {
            TrainingCenter trainingCenter = trainingCenterService.createTrainingCenter(request);
            return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("training center created", trainingCenter));
        } catch (Exception e) {
            return ResponseEntity.status(INTERNAL_SERVER_ERROR).body(new ApiResponse(e.getMessage(), null));
        }
    }

    @GetMapping("/search")
    public List<TrainingCenter> getTrainingCenters(
            @RequestParam(required = false) String centerName,
            @RequestParam(required = false) String centerCode,
            @RequestParam(required = false) String detailedAddress,
            @RequestParam(required = false) String city,
            @RequestParam(required = false) String state,
            @RequestParam(required = false) String pincode,
            @RequestParam(required = false) Integer studentCapacity,
            @RequestParam(required = false) Integer studentCapacityGreaterThan,
            @RequestParam(required = false) Integer studentCapacityLessThan,
            @RequestParam(required = false) String courseOffered,
            @RequestParam(required = false) Long createdOn,
            @RequestParam(required = false) Long createdOnGreaterThan,
            @RequestParam(required = false) Long createdOnLessThan,
            @RequestParam(required = false) String contactEmail,
            @RequestParam(required = false) String contactPhone
    ) {
        Specification<TrainingCenter> spec = Specification.where(null);

        if (centerName != null && !centerName.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasCenterName(centerName));
        }
        if (centerCode != null && !centerCode.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasCenterCode(centerCode));
        }
        if (detailedAddress != null && !detailedAddress.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasDetailedAddress(detailedAddress));
        }
        if (city != null && !city.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasCity(city));
        }
        if (state != null && !state.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasState(state));
        }
        if (pincode != null && !pincode.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasPincode(pincode));
        }
        if (studentCapacity != null) {
            spec = spec.and(TrainingCenterSpecification.hasStudentCapacity(studentCapacity));
        }
        if (studentCapacityGreaterThan != null) {
            spec = spec.and(TrainingCenterSpecification.hasStudentCapacityGreaterThan(studentCapacityGreaterThan));
        }
        if (studentCapacityLessThan != null) {
            spec = spec.and(TrainingCenterSpecification.hasStudentCapacityLessThan(studentCapacityLessThan));
        }
        if (courseOffered != null && !courseOffered.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasCourseOffered(courseOffered));
        }
        if (createdOn != null) {
            spec = spec.and(TrainingCenterSpecification.hasCreatedOn(createdOn));
        }
        if (createdOnGreaterThan != null) {
            spec = spec.and(TrainingCenterSpecification.hasCreatedOnGreaterThan(createdOnGreaterThan));
        }
        if (createdOnLessThan != null) {
            spec = spec.and(TrainingCenterSpecification.hasCreatedOnLessThan(createdOnLessThan));
        }
        if (contactEmail != null && !contactEmail.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasContactEmail(contactEmail));
        }
        if (contactPhone != null && !contactPhone.isEmpty()) {
            spec = spec.and(TrainingCenterSpecification.hasContactPhone(contactPhone));
        }

        List<TrainingCenter> trainingCenters = trainingCenterRepository.findAll(spec);
        trainingCenters.forEach(tc -> {
            if (tc.getAddress() != null) {
                tc.getAddress().getDetailedAddress(); // Access a field to force loading
            }
        });
        return trainingCenters;
    }

}
