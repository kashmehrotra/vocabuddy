package com.vocabuddy.biz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vocabuddy.api.service.ITestService;
import com.vocabuddy.api.service.IWordService;

@Service
public class TestServiceImpl implements ITestService{

	@Autowired
	private IWordService wordService;
	
	@Override
	public String test() {
		return wordService.test();
	}

}
