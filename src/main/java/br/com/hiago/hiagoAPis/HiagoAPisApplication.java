package br.com.hiago.hiagoAPis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HiagoAPisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HiagoAPisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Spring boot Console");
	}
}
