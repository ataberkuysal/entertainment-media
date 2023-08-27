package com.ata.entertainmentmedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages = {"com.ata.entertainmentmedia.web.services","com.ata.entertainmentmedia.web.repos", "com.ata.entertainmentmedia.web.controllers","com.ata.entertainmentmedia.entities"})
public class EntertainmentMediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EntertainmentMediaApplication.class, args);
	}

}
