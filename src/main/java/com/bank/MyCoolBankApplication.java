package com.bank;

import com.bank.Controller.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackageClasses = MainController.class)
@EntityScan("com.bank")
@EnableJpaRepositories("com.bank")
@ComponentScan("com.bank.Service")
public class MyCoolBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyCoolBankApplication.class, args);
	}

}
