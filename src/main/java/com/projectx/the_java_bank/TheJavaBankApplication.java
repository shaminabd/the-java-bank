package com.projectx.the_java_bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "The Java Banking App",
				description="Backend REST APIs for JBank",
				version="v1.0",
				contact= @Contact(
						name = "Shynggys Abdullayev",
						email= "sabdullaev141@gmail.com",
						url= "https://github.com/projectx/the_javabank_app"
				),
				license= @License(
						name= "The Java"
				)

		),
		externalDocs= @ExternalDocumentation(
				description= "The Java Bank App Documentation",
				url= "https://github.com/projectx/the_javabank_app"
		)
)
public class TheJavaBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheJavaBankApplication.class, args);
	}

}
