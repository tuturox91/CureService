package com.sniklz.tabletkitest.service.mapper.impl;

import com.sniklz.tabletkitest.dto.CureRequestDto;
import com.sniklz.tabletkitest.dto.CureResponseDto;
import com.sniklz.tabletkitest.model.Cure;
import com.sniklz.tabletkitest.service.mapper.UniversalMapper;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class CureDtoMapper implements UniversalMapper<Cure, CureRequestDto, CureResponseDto> {

    @Override
    public Cure toModel(CureRequestDto requestDto) {
        Cure cure = new Cure();
        if(requestDto.getCost() != null)
            cure.setCost(requestDto.getCost());
        if(requestDto.getName() != null)
            cure.setName(requestDto.getName());
        if(requestDto.getType() != null)
            cure.setType(Cure.Type.valueOf(requestDto.getType().toUpperCase()));
        if(requestDto.getCost() != null)
            cure.setCost(requestDto.getCost());
        if(requestDto.getSize() != null)
            cure.setSize(requestDto.getSize());
        return cure;
    }

    @Override
    public CureResponseDto toResponseDto(Cure model) {
        CureResponseDto responseDto = new CureResponseDto();
        responseDto.setId(model.getId());
        responseDto.setName(model.getName());
        responseDto.setCost(model.getCost());
        responseDto.setType(model.getType().getType());
        responseDto.setSize(model.getSize());
        return responseDto;
    }
}
