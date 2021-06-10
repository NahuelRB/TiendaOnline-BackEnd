package com.eternamania;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.eternamania.entities.Producto;

@SpringBootApplication
public class EternamaniaBackendApplication {

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(EternamaniaBackendApplication.class, args);
	}

}
