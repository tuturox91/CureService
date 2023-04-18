package com.sniklz.tabletkitest.controller;

import com.sniklz.tabletkitest.dto.CureRequestDto;
import com.sniklz.tabletkitest.dto.CureResponseDto;
import com.sniklz.tabletkitest.model.Cure;
import com.sniklz.tabletkitest.service.CureService;
import com.sniklz.tabletkitest.service.mapper.UniversalMapper;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cure")
public class CureController {

    private final CureService cureService;
    private final UniversalMapper<Cure, CureRequestDto, CureResponseDto> mapper;

    public CureController(CureService cureServiceImpl, UniversalMapper<Cure, CureRequestDto, CureResponseDto> mapper) {
        this.cureService = cureServiceImpl;
        this.mapper = mapper;
    }

    @PostMapping
    public CureResponseDto save(@RequestBody CureRequestDto dto) {
        return mapper.toResponseDto(cureService.save(mapper.toModel(dto)));
    }

    @GetMapping("/{id}")
    public CureResponseDto getById(@PathVariable Long id) {
        return mapper.toResponseDto(cureService.getById(id));
    }

    @PutMapping("/{id}")
    public CureResponseDto update(@PathVariable Long id, @RequestBody CureRequestDto requestDto) {
        Cure cure = mapper.toModel(requestDto);
        cure.setId(id);
        return mapper.toResponseDto(cureService.update(cure));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        cureService.deleteById(id);
    }

}
