package com.staylward.neuralnetworks.repository;

import com.staylward.neuralnetworks.model.Weight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeightRepository extends JpaRepository<Weight, Long> {

}
