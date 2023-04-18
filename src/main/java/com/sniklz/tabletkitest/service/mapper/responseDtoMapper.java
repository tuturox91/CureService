package com.sniklz.tabletkitest.service.mapper;

public interface responseDtoMapper<T, D> {
    D toResponseDto(T model);
}
