package com.github.jdrs.ff9.dao;

import com.github.jdrs.ff9.jdbc.JDBCConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.github.jdrs.ff9.entity.Character;

@Repository
public class CharacterDaoImpl implements ICharacterDao {

    @Autowired
    private ILocationDao locationDao;

    private JDBCConnection jdbcConn = new JDBCConnection();
    private Connection conn;

    private void connect() {
        if (conn == null)
            conn = jdbcConn.getConnection();
    }

    @Override
    public List<Character> getAllCharacters() {
        connect();

        List<Character> chList = new ArrayList<>();

        try {
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM ch_basic");
            ResultSet rsCh = ps.executeQuery();
            ResultSet rsLoc;

            while (rsCh.next()) {
                String home_id = "";
                ps = conn.prepareStatement("SELECT loc_id FROM ch_home where ch_id = " + rsCh.getInt("id"));
                rsLoc = ps.executeQuery();

                while (rsLoc.next()) {
                    home_id = rsLoc.getString("loc_id");
                }

                chList.add(new Character(
                        rsCh.getInt("id"),
                        rsCh.getString("name"),
                        rsCh.getInt("age"),
                        locationDao.getLocation(home_id))
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return chList;
    }

    @Override
    public Character getCharacter(String id) {
        connect();

        Character ch = null;

        try {
            String home_id = "";

            PreparedStatement ps = conn.prepareStatement(
                    "SELECT * FROM ch_basic WHERE name = \"" + id + "\" OR id = \"" + id + "\"");
            ResultSet rsCh = ps.executeQuery();
            ResultSet rsLoc;

            while (rsCh.next()) {
                ps = conn.prepareStatement(
                        "SELECT loc_id FROM ch_home WHERE ch_id = " + rsCh.getString("id"));
                rsLoc = ps.executeQuery();

                while (rsLoc.next()) {
                    home_id = rsLoc.getString("loc_id");
                }

                ch = new Character(
                        rsCh.getInt("id"),
                        rsCh.getString("name"),
                        rsCh.getInt("age"),
                        locationDao.getLocation(home_id)
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ch;
    }
}
