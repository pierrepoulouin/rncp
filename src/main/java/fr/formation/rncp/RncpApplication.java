package fr.formation.rncp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.jws.WebParam;

@SpringBootApplication
public class RncpApplication {

    public static void main(String[] args) {
	SpringApplication.run(RncpApplication.class, args);
    }
    @Bean
  protected ModelMapper modelMapper() {
      return new ModelMapper();
    }
}
