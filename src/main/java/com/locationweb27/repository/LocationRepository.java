package com.locationweb27.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.locationweb27.entity.Locations;


public interface LocationRepository extends JpaRepository<Locations, Long> {

}
