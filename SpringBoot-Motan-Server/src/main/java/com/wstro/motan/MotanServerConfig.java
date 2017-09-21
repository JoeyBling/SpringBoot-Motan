package com.wstro.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;

/**
 * Motan Server配置
 * 
 * @author Joey
 * @Email 2434387555@qq.com
 *
 */
@Configuration
public class MotanServerConfig {

	/**
	 * Motan服务端配置
	 * 
	 * @return BasicServiceConfigBean
	 */
	@Bean
	@ConfigurationProperties(prefix = "motan.server")
	public BasicServiceConfigBean baseServiceConfig() {
		BasicServiceConfigBean config = new BasicServiceConfigBean();
		return config;
	}
}
