package com.springbootexample.xworkz.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootexample.xworkz.entity.AppInfoEntity;

public interface AppInfoRepository extends JpaRepository<AppInfoEntity, Integer>{

}
