package com.github.jdrs.ff9.service;

import com.github.jdrs.ff9.entity.Location;

import java.util.List;

public interface ILocationService {
    public List<Location> getAllLocations();
    public Location getLocation(String id);
}
