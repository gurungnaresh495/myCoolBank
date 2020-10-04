package com.bank.myCoolBank;

import com.bank.Controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
public class MyCoolBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCoolBankApplication.class, args);
	}

}
