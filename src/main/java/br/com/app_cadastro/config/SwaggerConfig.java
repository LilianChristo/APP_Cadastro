package br.com.app_cadastro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration

public class SwaggerConfig {
	
	@Bean
	public OpenAPI customizarSwagger() {
		return new OpenAPI()
			.info(new Info()
			.title("RestFull API - Projeto Transforme-se")
			.version("v1")
			.description("API desenvolvida durante aulas de SpringBoot DH/SERASA")
			.termsOfService("http://swagger.io/terms")
			.license(new License().name("Apache 2.0").url("http://springdoc.org"))
							
					);
		
	}

}
