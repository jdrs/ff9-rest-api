package com.github.jdrs.ff9.controller;

import com.github.jdrs.ff9.entity.Location;
import com.github.jdrs.ff9.service.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ff9")
public class LocationController {

    @Autowired
    private ILocationService locationService;

    @RequestMapping("/locations")
    public List<Location> getAllLocations() {
        return locationService.getAllLocations();
    }

    @RequestMapping("/locations/location/{id}")
    public Location getLocation(@PathVariable String id) {
        return locationService.getLocation(id);
    }

    @RequestMapping("/locations/add")
    public Location addLocation(@RequestBody Location location) {
        return locationService.addLocation(location);
    }
}
