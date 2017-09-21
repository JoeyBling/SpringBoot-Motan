package com.wstro.service.impl;

import com.weibo.api.motan.config.springsupport.annotation.MotanService;
import com.wstro.service.MotanDemoService;

@MotanService
public class MotanDemoServiceImpl implements MotanDemoService {

	@Override
	public String hello(String name) {
		return "Hello:" + name + "!";
	}

}
