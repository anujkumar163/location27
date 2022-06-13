package com.locationweb27.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.locationweb27.entity.Locations;
import com.locationweb27.services.LocationServices;
import com.locationweb27.utility.EmailService;

//responcible to intract with view and backend business logic                                   
@Controller
public class LocationController {
	//calling service calss in controller
	@Autowired
	private LocationServices locationservice;
	
	@Autowired
	private EmailService emailService;
	
	//handler method
	@RequestMapping("/showLocationPage")
	public String showLocationPage() {
		return "create_location";
	}
	//data transfer object
	@RequestMapping("/saveLocation")
	public String saveLocation(@ModelAttribute("loc") Locations location, ModelMap model) {
//		System.out.println(location.getId());
//		System.out.println(location.getCode());
//		System.out.println(location.getName());
		emailService.sendSimpleMessage("anujK95@rediffmail.com","Test", "welcome message");
		locationservice.savelocation(location);
		model.addAttribute("msg", "location is save");
		
		return "create_location";
	}
	
	@RequestMapping("/listAll")
	public String listAll(ModelMap model) {
		List<Locations> locations = locationservice.getAllLocations();
		System.out.println(locations);
		model.addAttribute("locations", locations);
		return "serch_result";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam("id") long id,ModelMap model) {
		locationservice.deleteLocationById(id);
		List<Locations> locations = locationservice.getAllLocations();
		System.out.println(locations);
		model.addAttribute("locations", locations);
		return "serch_result";
	}
	
	@RequestMapping("/update")
	public String upLocation(@RequestParam("id") long id,ModelMap model) {
		Locations location = locationservice.getLocationById(id);
		model.addAttribute("location", location);
		return "update_location";
	}
	@RequestMapping("/updateLocation")
	public String updateLocation(@ModelAttribute("loc") Locations location, ModelMap model) {
		locationservice.savelocation(location);
		model.addAttribute("msg", "location is updated");
		return "update_location";
	}
}
