package com.spdb.cdu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloWorldContrller {
	@Autowired
   private DiscoveryClient client;
	@RequestMapping(value="/hellWorld",method = RequestMethod.GET)
	public String hellWorld(String content) {
		List<ServiceInstance> instanceLst=client.getInstances("eureka-service");
		System.out.println("=====================================");
		for( ServiceInstance s:instanceLst) {
			System.out.println(s.getPort()+":"+s.getHost());
		}
		return "helloWold " +content;
	}
}
