package com.sniklz.tabletkitest.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CureRequestDto {
    private String name;
    private String type;
    private Double size;
    private BigDecimal cost;
}
