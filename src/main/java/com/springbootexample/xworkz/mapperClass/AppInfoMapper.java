package com.springbootexample.xworkz.mapperClass;


import org.mapstruct.Mapper;

import com.springbootexample.xworkz.dto.AppInfoDTO;
import com.springbootexample.xworkz.entity.AppInfoEntity;



@Mapper(componentModel = "spring")
public interface AppInfoMapper {
	public AppInfoEntity convertDTOToEntity(AppInfoDTO appInfoDTO) ;
}
