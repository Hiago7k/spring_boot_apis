package br.com.hiago.hiagoAPis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

@SpringBootApplication
public class HiagoAPisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HiagoAPisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//serializar a classe tarefas para um arquivo json
		// 1 estanciar a classe tarefas ok
		// 2 Transformar essa classe em um JSON, através do jackson
		// Talvez criar um mappper, depois utilizar ele

		Tarefa tarefas = new Tarefa("Lavar roupas", true, "Hiago Mendes");
		System.out.println(tarefas.toString());

//		FileWriter conversor = new FileWriter("tarefa.json");
//		conversor.write(tarefas.toString());
//		conversor.close();



	}
}
