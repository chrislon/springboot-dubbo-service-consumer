package com.skss.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.skss.demo.consumer.DubboConsumer;


@SpringBootApplication
public class Run {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Run.class, args);
		DubboConsumer dubboConsumer = run.getBean(DubboConsumer.class);
		dubboConsumer.getNameByIdForXml();
		dubboConsumer.getNameByIdForAnnotation();
		dubboConsumer.redisSet("springboot-dubbo-test", "yes");
		dubboConsumer.redisGet("springboot-dubbo-test");
	}

}
