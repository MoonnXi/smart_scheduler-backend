package org.example.smart_schedulerbackend.service;

import org.example.smart_schedulerbackend.model.entity.ProfessionalData;

import java.util.List;
import java.util.Map;

public interface ProfessionalDataService {
    List<Map<String,Object>> getAllProfessionalData();
}
