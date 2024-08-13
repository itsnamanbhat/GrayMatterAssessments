package com.graymatter.dao;

import java.sql.ResultSet;

import java.sql.SQLException;



import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.graymatter.model.Orders;

public class OrdersRowMapper implements RowMapper<Orders> {
	
		@Override
		public Orders mapRow(ResultSet rs,int rowNum) throws SQLException, DataAccessException {
			
				return new Orders(rs.getInt(1),rs.getDate(2),rs.getDouble(3),rs.getInt(4));
		}

	

}
