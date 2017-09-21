package com.wstro.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;

/**
 * Motan Client配置
 * 
 * @author Joey
 * @Email 2434387555@qq.com
 *
 */
@Configuration
public class MotanClientConfig {

	/**
	 * 客户端配置
	 * 
	 * @return BasicRefererConfigBean
	 */
	@Bean(name = "clientBasicConfig")
	@ConfigurationProperties(prefix = "motan.client")
	public BasicRefererConfigBean baseRefererConfig() {
		BasicRefererConfigBean config = new BasicRefererConfigBean();
		return config;
	}
}
