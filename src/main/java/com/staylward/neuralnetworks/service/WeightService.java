package com.staylward.neuralnetworks.service;

import com.staylward.neuralnetworks.model.Weight;
import com.staylward.neuralnetworks.repository.WeightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightService {
    private WeightRepository repository;

    @Autowired
    public WeightService(WeightRepository repository) {
        this.repository = repository;
    }

    public List<Weight> getAll() {
        return repository.findAll();
    }
}
