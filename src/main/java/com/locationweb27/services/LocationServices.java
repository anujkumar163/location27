package com.locationweb27.services;

import java.util.List;

import com.locationweb27.entity.Locations;

public interface LocationServices {
	public void savelocation(Locations location);

	public List<Locations> getAllLocations();

	public void deleteLocationById(long id);

	public Locations getLocationById(long id);
	

	
}
