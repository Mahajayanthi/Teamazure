package com.example.Teamazure.Teamazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TeamazureApplication {
	@GetMapping("/hi")
	public String message() {
		return "The main aim of the project is to deploy the same code in GCP and Azure platform.\r\n"
				+ "\r\n"
		
				+ "Microsoft Azure(Maha & Jayanthi):\n"
				
				+ "Microsoft Azure is a public cloud computing platform—with solutions including Infrastructure as a Service (IaaS), Platform as a Service (PaaS), and Software as a Service (SaaS) that can be used for services such as analytics, virtual computing, storage and networking . "
				
				
				+ "These services and resources include storing your \r\n"
				+ "data and transforming it, depending on your requirements.\r\n"
				+ "\r\n"
				
				+ ""
				+ "Google Cloud Platform(Kiruba & Juju):\r\n"
				+ "Google Cloud Platform is a suite of public cloud computing services offered by Google.\n"
				+ "The platform includes a range of hosted services for compute, storage and application development that run on Google hardware.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(TeamazureApplication.class, args);
	}

}
