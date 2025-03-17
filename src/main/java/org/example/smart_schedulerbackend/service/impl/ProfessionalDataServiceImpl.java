package org.example.smart_schedulerbackend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.smart_schedulerbackend.mapper.ProfessionalDataMapper;
import org.example.smart_schedulerbackend.model.dto.ProfessionalDTO;
import org.example.smart_schedulerbackend.model.entity.ProfessionalData;
import org.example.smart_schedulerbackend.service.ProfessionalDataService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalDataServiceImpl extends ServiceImpl<ProfessionalDataMapper, ProfessionalData> implements ProfessionalDataService {

    @Override
    public List<String> getAllAffiliations() {
        return baseMapper.getAllAffiliations();
    }

    @Override
    public List<ProfessionalDTO> getProfessionalsByAffiliation(String affiliation) {
        System.out.println("affiliation = " + affiliation);
        List<ProfessionalDTO> professionals = baseMapper.getProfessionalsByAffiliation(affiliation);
        System.out.println("professionals = " + professionals);
        return professionals;
    }
}
