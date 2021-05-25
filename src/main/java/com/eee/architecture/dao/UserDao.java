package com.eee.architecture.dao;

import com.ease.architecture.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public User findByUserId(String id) {
        final User user = new User();
        String sql = "SELECT * FROM t_user_1 WHERE id=?";
        jdbcTemplate.query(sql, new Object[]{id}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getString(1));
                user.setName(resultSet.getString(2));
            }
        });
        return user;
    }


    public User findByName(String name) {


        final User user = new User();
        String sql = "SELECT * FROM t_user_1 WHERE name=?";
        jdbcTemplate.query(sql, new Object[]{name}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getString(1));
                user.setName(resultSet.getString(2));
            }
        });
        return user;
    }

    public User findByNameAndPassword(String name, String password) {

        final User user = new User();
        String sql = "SELECT * FROM t_user_1 WHERE name=? AND password=?";
        jdbcTemplate.query(sql, new Object[]{name, password}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                user.setId(resultSet.getString(1));
                user.setName(resultSet.getString(2));
            }
        });
        return user;
    }

    public int insertUser(User user) {
        String sql = "INSERT INTO t_user_1 (id,name,password) VALUES (?,?,?)";
        return jdbcTemplate.update(sql, user.getId(), user.getName(), user.getPassword());
    }
}
