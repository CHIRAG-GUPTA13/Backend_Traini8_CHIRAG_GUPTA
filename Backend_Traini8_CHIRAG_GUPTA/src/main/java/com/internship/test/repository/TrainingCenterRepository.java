package com.internship.test.repository;

import com.internship.test.model.TrainingCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingCenterRepository extends JpaRepository<TrainingCenter , Long>, JpaSpecificationExecutor<TrainingCenter> {
}
