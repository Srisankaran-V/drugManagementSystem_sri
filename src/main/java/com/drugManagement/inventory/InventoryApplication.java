package com.drugManagement.inventory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.SocketOption;

@SpringBootApplication
public class InventoryApplication {

	public static void main(String[] args) {
		System.out.println("program started");

		SpringApplication.run(InventoryApplication.class, args);

	}

}
