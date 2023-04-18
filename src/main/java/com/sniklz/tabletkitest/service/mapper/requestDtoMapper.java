package com.sniklz.tabletkitest.service.mapper;

public interface requestDtoMapper<T, D>{

    T toModel(D requestDto);
}
