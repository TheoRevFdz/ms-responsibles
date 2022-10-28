package nttdata.bootcamp.mscustomeraccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsResponsiblesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsResponsiblesApplication.class, args);
	}

}
