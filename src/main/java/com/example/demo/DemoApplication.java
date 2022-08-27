package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@RequestMapping("/")
	public String sayHello() {
		return "Hello World!";
	}

	@RequestMapping("/regs")
	public String regsList() {
		return "Regulations";
	}

	@RequestMapping("/regs/edit")
	public String regsEdit() {
		return "Edit Regs";
	}

	@RequestMapping("/decisions")
	public String decisions() {
		return "Decisions";
	}

	@RequestMapping("/decisions/edit")
	public String decisionsEdit() {
		return "Edit Decisions";
	}

	@RequestMapping("/drivers")
	public String drivers() {
		return "Drivers";
	}

	@RequestMapping("/drivers/edit")
	public String driversEdit() {
		return "Edit Drivers";
	}

	@RequestMapping("/leagues")
	public String leagues() {
		return "Leagues";
	}

	@RequestMapping("/leagues/edit")
	public String leaguesEdit() {
		return "Edit Leagues";
	}

	@RequestMapping("/event")
	public String events() {
		return "Events";
	}

	@RequestMapping("/event/edit")
	public String eventEdit() {
		return "Edit Event";
	}

	@RequestMapping("/reports")
	public String reports() {
		return "Reports";
	}

	@RequestMapping("/reports/edit")
	public String reportEdit() {
		return "Edit Report";
	}

	@RequestMapping("/reports/penalty")
	public String penalty() {
		return "Penalty";
	}

	@RequestMapping("/reports/appeal")
	public String appeal() {
		return "Appeal";
	}
}
