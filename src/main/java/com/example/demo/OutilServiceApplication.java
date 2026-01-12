package com.example.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.example.demo.dao.OutilRepository;
import com.example.demo.entities.Outil;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
@EnableDiscoveryClient
public class OutilServiceApplication implements CommandLineRunner{
	OutilRepository outilRepository;

	public static void main(String[] args) {
		SpringApplication.run(OutilServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Outil outil=Outil.builder().date(new Date())
                .source("https://www.wireshark.org/").build();
		outilRepository.save(outil);
		
		
		
		
	}

}
