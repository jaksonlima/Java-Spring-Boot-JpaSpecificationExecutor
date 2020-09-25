package jpa.data.specification;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.util.StringUtils;

@SpringBootApplication
public class SpecificationApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpecificationApplication.class, args);
	}

	@Bean
	public CommandLineRunner runn(){
			return (args) -> {
					System.out.println(StringUtils.arrayToDelimitedString(args, "_"));
			};
	}

}
