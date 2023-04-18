package com.sniklz.tabletkitest.service.mapper;

public interface UniversalMapper<Model, Request, Response>
        extends requestDtoMapper<Model, Request>,
        responseDtoMapper<Model, Response> {


}
