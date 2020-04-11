package com.staylward.neuralnetworks.controller;

import com.staylward.neuralnetworks.model.Weight;
import com.staylward.neuralnetworks.service.WeightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class WeightController {
    private WeightService weightService;

    @Autowired
    public WeightController(WeightService weightService) {
        this.weightService = weightService;
    }

    @GetMapping(value = "/weight")
    public List<Weight> getAllWeights() {
        return weightService.getAll();
    }
}
