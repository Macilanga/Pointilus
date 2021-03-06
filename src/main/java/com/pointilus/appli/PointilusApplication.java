package com.pointilus.appli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.data.mongo.MongoRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class, MongoRepositoriesAutoConfiguration.class, MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
public class PointilusApplication {

	public static void main(String[] args) {
		SpringApplication.run(PointilusApplication.class, args);
	}
}
