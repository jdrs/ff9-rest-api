package com.github.jdrs.ff9.dao;

import com.github.jdrs.ff9.entity.Location;
import com.github.jdrs.ff9.jdbc.JDBCConnection;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class LocationDaoImpl implements ILocationDao {

    private JDBCConnection jdbcConn = new JDBCConnection();
    private Connection conn;

    private void connect() {
        if (conn == null)
            conn = jdbcConn.getConnection();
    }

    @Override
    public List<Location> getAllLocations() {
        connect();

        List<Location> locList = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM loc_basic");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                locList.add(new Location(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("type"),
                        rs.getString("region"))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return locList;
    }

    @Override
    public Location getLocation(String id) {
        connect();

        Location loc = null;

        try {
            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM loc_basic WHERE name = \"" + id + "\" OR id = \"" + id + "\"");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                loc = new Location(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("type"),
                        rs.getString("region")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return loc;
    }
}
