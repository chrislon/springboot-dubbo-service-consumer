package com.skss.demo.consumer;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.skss.demo.stub.DubboService;

@Component
public class DubboConsumer {
	@Reference(version = "1.0.0")
	DubboService dubboService;

	public void getNameByIdForXml() {
		String name = dubboService.getNameByIdForXml(1);
		System.out.println(name);
	}
	
	
	public void getNameByIdForAnnotation() {
		String name = dubboService.getNameByIdForAnnotation(2);
		System.out.println(name);
	}
	
	public void redisGet(String key) {
		System.out.println(this.dubboService.redisGet(key));
	}
	
	public void redisSet(String key,String value) {
		this.dubboService.redisSet(key, value);
	}
	
}
