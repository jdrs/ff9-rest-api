package com.github.jdrs.ff9.service;

import com.github.jdrs.ff9.dao.ILocationDao;
import com.github.jdrs.ff9.entity.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements ILocationService {

    @Autowired
    private ILocationDao locationDao;

    @Override
    public Location getLocation(String id) {
        return locationDao.getLocation(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationDao.getAllLocations();
    }

    @Override
    public Location addLocation(Location location) {
        return locationDao.addLocation(location);
    }
}
