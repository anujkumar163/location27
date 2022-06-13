package com.locationweb27.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.locationweb27.entity.*;
import com.locationweb27.repository.LocationRepository;

//web-services
@RestController
@RequestMapping("/location/api")
//exposing web services, develop api,develop end-point in project
public class LocationRestController {
	
	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping
	public List<Locations> getLocations(){
		List<Locations> locations = locationRepo.findAll();
		return locations;
	}
	@PostMapping
	public void saveLocatio(@RequestBody Locations location) {
		locationRepo.save(location);
	}
	
	@PutMapping
	public void updateLocatio(@RequestBody Locations location) {
		locationRepo.save(location);
	}
	
	@DeleteMapping("/delete{id}")
	public void deleteLocatio(@PathVariable("id") long id) {
		locationRepo.deleteById(id);
	} 
	//micro-services
	@GetMapping("/get/{id}")
	public Locations getLocationById(@PathVariable("id") long id) {
		try {
			Optional<Locations> findById = locationRepo.findById(id);
			Locations location = findById.get();
			return location;
		} catch (Exception e) {
			//model.addAttribute("resourceNotFound","no record found");
			e.printStackTrace();
			
		}
		return null;
	}
	
	
	
	
}
