package com.springbootexample.xworkz.mapperClass;

import java.util.List;

import org.mapstruct.Mapper;

import com.springbootexample.xworkz.dto.EnvironmentDTO;
import com.springbootexample.xworkz.entity.EnvironmentEntity;

@Mapper(componentModel = "spring")
public interface EnvironmentInfoMapper {
	public List<EnvironmentEntity> convertDTOToEntity(List<EnvironmentDTO> list) ;
}
