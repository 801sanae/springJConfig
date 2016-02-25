package com.hanains.spring.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

	public MainService() {
		System.out.println(this.getClass());
	}
}
