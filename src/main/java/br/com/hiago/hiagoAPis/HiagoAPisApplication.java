package br.com.hiago.hiagoAPis;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class HiagoAPisApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HiagoAPisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Spring boot Console");
		System.out.println("Digite um numero: ");
		int numeroDigitado = teclado.nextInt();

		System.out.println("Iniciando contagem até: " + numeroDigitado);
		for(var i = 1; i <= numeroDigitado; i++){
			System.out.println(i);
		}

	}
}
