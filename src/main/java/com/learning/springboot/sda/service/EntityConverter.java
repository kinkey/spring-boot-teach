package com.learning.springboot.sda.service;

public interface EntityConverter<ENTITY, DTO> {

    public DTO convertToDTO(ENTITY entity);

    public ENTITY convertToEntity(DTO dto);
}
