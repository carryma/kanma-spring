package com.daoimpl;

import com.dao.BankDao;
import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void inMoney(int money, int userId) {
        String sql = "update t_count2 set count=count+? where userId=? ";
        Object[] params = new Object[]{money,userId};
        jdbcTemplate.update(sql,params);
    }

    @Override
    public void outMoney(int money, int userId) {
        String sql = "update t_count set count=count-? where userId=? ";
        Object[] params = new Object[]{money,userId};
        jdbcTemplate.update(sql,params);
    }
}
