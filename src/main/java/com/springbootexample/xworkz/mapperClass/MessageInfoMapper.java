package com.springbootexample.xworkz.mapperClass;

import org.mapstruct.Mapper;

import com.springbootexample.xworkz.dto.PrintDTO;
import com.springbootexample.xworkz.entity.PrintEntity;

@Mapper(componentModel = "spring")
public interface MessageInfoMapper {
	 PrintEntity convertDTOToEntity(PrintDTO dto);
}
