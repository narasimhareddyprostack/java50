package com.psa.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao {

	
	@Autowired
	JdbcTemplate jt;	
	@Override
	public void insertRecords() {
		jt.update("insert into employee values(101,'Rahul',45000.00)");
		jt.update("insert into employee values(102,'Abhi',45000.00)");
		jt.update("insert into employee values(103,'Vasu',45000.00)");
		jt.update("insert into employee values(104,'Miss Lalitha',45000.00)");
		jt.update("insert into employee values(105,'MR Rahul',45000.00)");
		

	}

	@Override
	public List getRecords() {
		return jt.queryForList("select * from employee");
	}

	@Override
	public void deleteRecords() {
		jt.update("delete from employee where eid=104");
		
	}

}
