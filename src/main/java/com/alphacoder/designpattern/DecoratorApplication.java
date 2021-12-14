package com.alphacoder.designpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorApplication.class, args);

		FileOperator operator= new SimpleFileOperator();
		EncryptionDecorator encryptionDecorator= new EncryptionDecorator(operator);

		encryptionDecorator.writeFile();
		encryptionDecorator.readFile();
	}

}
