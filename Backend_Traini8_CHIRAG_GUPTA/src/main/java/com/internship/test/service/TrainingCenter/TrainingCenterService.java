package com.internship.test.service.TrainingCenter;

import com.internship.test.model.Address;
import com.internship.test.model.TrainingCenter;
import com.internship.test.repository.AddressRepository;
import com.internship.test.repository.TrainingCenterRepository;
import com.internship.test.request.TrainingCenterRequest;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TrainingCenterService implements ITrainingCenterService {
    private final TrainingCenterRepository trainingCenterRepository;
    private final AddressRepository addressRepository;

    public TrainingCenterService(TrainingCenterRepository trainingCenterRepository, AddressRepository addressRepository) {
        this.trainingCenterRepository = trainingCenterRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public TrainingCenter createTrainingCenter(TrainingCenterRequest request) {
        TrainingCenter trainingCenter = new TrainingCenter();           //creating training center and adding data

        trainingCenter.setCenterName(request.getCenterName());
        trainingCenter.setCenterCode(request.getCenterCode());
        trainingCenter.setStudentCapacity(request.getStudentCapacity());
        trainingCenter.setCoursesOffered(request.getCoursesOffered());
        trainingCenter.setCreatedOn(Instant.now().getEpochSecond());
        trainingCenter.setContactEmail(request.getContactEmail());
        trainingCenter.setContactPhone(request.getContactPhone());

        Address address = new Address();                                //  creating address, adding data
        address.setDetailedAddress(request.getAddress().getDetailedAddress());
        address.setCity(request.getAddress().getCity());
        address.setState(request.getAddress().getState());
        address.setPinCode(request.getAddress().getPinCode());

        Address savedAddress = addressRepository.save(address);         //saving address in DB

        trainingCenter.setAddress(savedAddress);                        //saving address in training center

        return trainingCenterRepository.save(trainingCenter);           //saving training center in DB

    }
}
