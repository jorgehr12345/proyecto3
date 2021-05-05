package com.example.Proyecto8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Proyecto24Application {

	public static void main(String[] args) {
		//Map<Integer,String> l=new LinkedHashMap<Integer,String>();
		//Map<Integer,String> m=new HashMap<Integer,String>();
		//Map<Integer,String> n=new TreeMap<Integer,String>();
		SpringApplication.run(Proyecto24Application.class, args);
	}

}
