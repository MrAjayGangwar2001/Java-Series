package com.spring.JDBC.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.JDBC.Model.Alien;

@Repository
public class AlienRepo {

    private JdbcTemplate temp;

    public JdbcTemplate getTemp() {
        return temp;
    }

    @Autowired
    public void setTemp(JdbcTemplate temp) {
        this.temp = temp;
    }

    public void saveData(Alien alien) {
        // Saved
        String sql = "insert into alien (id, name, course) values (?, ?, ?)";

        int row = temp.update(sql, alien.getId(), alien.getName(), alien.getCourse());
        System.out.println("Rows Affected : " + row);
    }

    public List<Alien> GetAllData() {

        String sql = "select * from alien";

        // RowMapper is Functional Interface

        // RowMapper <Alien> mapper = new RowMapper<Alien>() {

        // @Override
        // public Alien mapRow(ResultSet rs, int romNum) throws SQLException{
        // Alien a = new Alien();
        // a.setId(rs.getInt(1));
        // a.setName(rs.getString(2));
        // a.setCourse(rs.getString(3));

        // return a;
        // }
        // };

        // By Using Lamda Expression
        // RowMapper <Alien> mapper = (rs, romNum) -> {
        // Alien a = new Alien();
        // a.setId(rs.getInt(1));
        // a.setName(rs.getString(2));
        // a.setCourse(rs.getString(3));

        // return a;
        // };
        // List<Alien> alien = temp.query(sql, mapper);

        // ---------------------------------------------------------------------------

        // -----------OR ----We can Write Another type to reduce code----
        List<Alien> alien = temp.query(sql,
                (rs, romNum) -> {
                    Alien a = new Alien();
                    a.setId(rs.getInt(1));
                    a.setName(rs.getString(2));
                    a.setCourse(rs.getString(3));

                    return a;
                }); 

        return alien;
    }
}
