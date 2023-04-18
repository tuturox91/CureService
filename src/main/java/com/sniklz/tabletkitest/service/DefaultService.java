package com.sniklz.tabletkitest.service;

public interface DefaultService<T> {

    T save(T model);

    T getById(Long id);

    T update(T model);

    void deleteById(Long id);
}
