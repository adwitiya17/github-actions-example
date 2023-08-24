package com.gitactioncicd.githubcicdactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GithubCicdActionsApplication {

	@GetMapping("/welcome")
		public String welcome() {
			return "Welcome to india!!";
			
		}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubCicdActionsApplication.class, args);
	}

}
