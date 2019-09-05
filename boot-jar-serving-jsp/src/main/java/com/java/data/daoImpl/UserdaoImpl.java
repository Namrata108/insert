package com.java.data.daoImpl;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.java.data.dao.Userdao;
import com.java.data.model.User;

@Repository
public class UserdaoImpl extends JdbcDaoSupport implements Userdao {

	@Autowired 
	DataSource dataSource;
	
	@PostConstruct
	private void initialize(){
		setDataSource(dataSource);
	}
	
	public void insertUser(User user) {
		String sql = "INSERT INTO user " + "(id, name) VALUES (?, ?)" ;
		getJdbcTemplate().update(sql, new Object[]{
				user.getId(), user.getName()
		});
	}
	
}

