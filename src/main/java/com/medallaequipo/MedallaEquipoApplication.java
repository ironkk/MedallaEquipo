package com.medallaequipo;

import com.medallaequipo.Service.AtletaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MedallaEquipoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(MedallaEquipoApplication.class, args);

		AtletaService atletaService = context.getBean(AtletaService.class);

		atletaService.registrarAtletas();

	}
}
