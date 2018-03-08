package com.spdb.cdu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/*
@EnableDiscoveryClient基于spring-cloud-commons, @EnableEurekaClient基于spring-cloud-netflix。
SpringCLoud中的“Discovery Service”有多种实现，比如：eureka, consul, zookeeper。

1，@EnableDiscoveryClient注解是基于spring-cloud-commons依赖，并且在classpath中实现； 
2，@EnableEurekaClient注解是基于spring-cloud-netflix依赖，只能为eureka作用；

如果你的classpath中添加了eureka，则它们的作用是一样的。
*/
@EnableDiscoveryClient
@SpringBootApplication
public class SpringServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringServer1Application.class, args);
	}
}
