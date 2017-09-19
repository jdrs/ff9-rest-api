package com.github.jdrs.ff9.dao;

import com.github.jdrs.ff9.entity.Location;
import java.util.List;

public interface ILocationDao {
    public List<Location> getAllLocations();
    public Location getLocation(String id);
}
