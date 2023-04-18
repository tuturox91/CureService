package com.sniklz.tabletkitest.service.impl;

import com.sniklz.tabletkitest.model.Cure;
import com.sniklz.tabletkitest.repository.CureRepository;
import com.sniklz.tabletkitest.service.CureService;
import com.sniklz.tabletkitest.service.DefaultService;
import org.springframework.stereotype.Service;

@Service
public class CureServiceImpl implements CureService {

    private final CureRepository cureRepository;

    public CureServiceImpl(CureRepository cureRepository) {
        this.cureRepository = cureRepository;
    }

    @Override
    public Cure save(Cure model) {
        return cureRepository.save(model);
    }

    @Override
    public Cure getById(Long id) {
        return cureRepository.getReferenceById(id);
    }

    @Override
    public Cure update(Cure model) {
        Cure byId = getById(model.getId());
        byId.setId(model.getId());
        byId.setName(model.getName());
        byId.setSize(model.getSize());
        byId.setCost(model.getCost());
        byId.setType(model.getType());
        save(byId);
        return byId;
    }

    @Override
    public void deleteById(Long id) {
        cureRepository.deleteById(id);
    }
}
