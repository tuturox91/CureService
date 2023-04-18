package com.sniklz.tabletkitest.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CureResponseDto {
    private Long id;
    private String name;
    private String type;
    private Double size;
    private BigDecimal cost;
}
