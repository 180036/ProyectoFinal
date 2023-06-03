package com.web.skins.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import  com.web.skins.models.entity.Skin;

@Repository
public interface SkinsRepository extends JpaRepository<Skin, Long>, PagingAndSortingRepository<Skin, Long>{

}
