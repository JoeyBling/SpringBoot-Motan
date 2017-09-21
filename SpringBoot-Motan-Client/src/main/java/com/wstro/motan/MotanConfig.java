package com.wstro.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

/**
 * Motan通用配置
 * 
 * @author Joey
 * @Email 2434387555@qq.com
 *
 */
@Configuration
public class MotanConfig {

	/**
	 * 声明Annotation用来指定需要解析的包名
	 * 
	 * @return AnnotationBean
	 */
	@Bean
	@ConfigurationProperties(prefix = "motan.annotation")
	public static AnnotationBean motanAnnotationBean() {
		AnnotationBean motanAnnotationBean = new AnnotationBean();
		return motanAnnotationBean;
	}

	/**
	 * Motan协议配置
	 * 
	 * @return ProtocolConfigBean
	 */
	@Bean(name = "motan")
	@ConfigurationProperties(prefix = "motan.protocol")
	public ProtocolConfigBean protocolConfig() {
		ProtocolConfigBean config = new ProtocolConfigBean();
		return config;
	}

	/**
	 * Motan注册中心配置
	 * 
	 * @return RegistryConfigBean
	 */
	@Bean(name = "registryConfig")
	@ConfigurationProperties(prefix = "motan.registry")
	public RegistryConfigBean registryConfig() {
		RegistryConfigBean config = new RegistryConfigBean();
		return config;
	}

}
