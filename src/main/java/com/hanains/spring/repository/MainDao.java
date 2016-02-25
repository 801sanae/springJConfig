package com.hanains.spring.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MainDao {

	public MainDao() {
		System.out.println(this.getClass());
	}
}
