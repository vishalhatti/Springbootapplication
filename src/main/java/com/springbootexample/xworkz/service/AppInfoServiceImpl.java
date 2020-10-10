package com.springbootexample.xworkz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootexample.xworkz.dto.AppInfoDTO;
import com.springbootexample.xworkz.entity.AppInfoEntity;
import com.springbootexample.xworkz.entity.EnvironmentEntity;
import com.springbootexample.xworkz.mapperClass.AppInfoMapper;
import com.springbootexample.xworkz.mapperClass.EnvironmentInfoMapper;
import com.springbootexample.xworkz.repository.AppInfoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AppInfoServiceImpl implements AppInfoService {

	@Autowired
	private AppInfoRepository appInfoRepository;
	
	@Autowired
	private AppInfoMapper appInfoMapper;
	
	@Autowired 
	private EnvironmentInfoMapper environmentInfoMapper;
	
	public AppInfoServiceImpl() {
		// TODO Auto-generated constructor stub
		log.info("serviceis created"+ this.getClass().getSimpleName());
	}
	
	@Override
	public AppInfoDTO validateandsave(AppInfoDTO appInfodto) {
      log.info("invoking the service :"+this.getClass().getSimpleName());
         
      try {
    	  AppInfoEntity appInfoEntity =appInfoMapper.convertDTOToEntity(appInfodto);
    	  List<EnvironmentEntity> environmentList =environmentInfoMapper.convertDTOToEntity(appInfodto.getEnvironmentList());
    	  for(int i = 0 ;i<environmentList.size();i++) {
				environmentList.get(i).setAppInfo(appInfoEntity);
			}
    	  appInfoEntity.setEnvironmentList(environmentList);
    	  appInfoEntity = appInfoRepository.save(appInfoEntity);
    	  log.error("Error :::::>>>>> {}",appInfoEntity.getEnvironmentList());
			if (appInfoEntity.getId() != null) {
				appInfodto.setId(appInfoEntity.getId());
			}
      } catch (Exception e) {
			e.printStackTrace();
		}
		return appInfodto;
	}
      
      
      

	}


