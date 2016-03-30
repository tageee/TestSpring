package com.tage.dao.impl;

import com.tage.dao.UserDAO;
import com.tage.model.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by tage on 3/26/16.
 */
public class UserDAOImpl implements UserDAO {
    private DataSource dataSource;
    private int id;

    @Override
    public void save(User user) {
        try {


            Connection connection = dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO user values (null, 'zhangsan')");
            preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("user saved");
    }

    /*  @Resource(name = "dataSource")*/
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id + "";
    }
}