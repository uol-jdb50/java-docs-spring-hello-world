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

	@GetMapping("/")
	public String sayHello() {
		return "Hello World!";
	}

	@GetMapping("/regs")
	public String regsList() {
		return "Regulations";
	}

	@GetMapping("/regs/edit")
	public String regsEdit() {
		return "Edit Regs";
	}

	@GetMapping("/decisions")
	public String decisions() {
		return "Decisions";
	}

	@GetMapping("/decisions/edit")
	public String decisionsEdit() {
		return "Edit Decisions";
	}

	@GetMapping("/drivers")
	public String drivers() {
		return "Drivers";
	}

	@GetMapping("/drivers/edit")
	public String driversEdit() {
		return "Edit Drivers";
	}

	@GetMapping("/leagues")
	public String leagues() {
		return "Leagues";
	}

	@GetMapping("/leagues/edit")
	public String leaguesEdit() {
		return "Edit Leagues";
	}

	@GetMapping("/event")
	public String events() {
		return "Events";
	}

	@GetMapping("/event/edit")
	public String eventEdit() {
		return "Edit Event";
	}

	@GetMapping("/reports")
	public String reports() {
		return "Reports";
	}

	@GetMapping("/reports/edit")
	public String reportEdit() {
		return "Edit Report";
	}

	@GetMapping("/reports/penalty")
	public String penalty() {
		return "Penalty";
	}

	@GetMapping("/reports/appeal")
	public String appeal() {
		return "Appeal";
	}
}
