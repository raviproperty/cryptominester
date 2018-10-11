package io.crypto.minester.mongo.data;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(value={"io.crypto.minester.controller"})
public class CryptoMinesterApplication  {
//	
//	 @Override
//	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//	        return application.sources(CryptoMinesterApplication.class);
//	    }

	public static void main(String[] args) {
		SpringApplication.run(CryptoMinesterApplication.class, args);
	}
}
