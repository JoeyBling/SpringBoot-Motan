package com.wstro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import com.wstro.service.MotanDemoService;

/**
 * Motan测试
 * 
 * @author Joey
 * @Email 2434387555@qq.com
 *
 */
@Controller
@RequestMapping("/")
public class HelloController {

	@MotanReferer(basicReferer = "clientBasicConfig")
	private MotanDemoService motanDemoService;

	/**
	 * Motan测试
	 * 
	 * @param name
	 *            Name
	 * @return String
	 */
	@RequestMapping(value = "/{name}")
	@ResponseBody
	public String hello(@PathVariable String name) {
		return motanDemoService.hello(name);
	}

}
