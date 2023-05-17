package com.example.sem4_pr12_PostConstruct_PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sem4Pr12PostConstructPreDestroyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Sem4Pr12PostConstructPreDestroyApplication.class, args);
	}

	@Autowired
	private Files files;

	@Override
	public void run(String... args) throws Exception {
		if (args.length == 2) files.start(args[0], args[1]);
		else files.hash();
	}
}
