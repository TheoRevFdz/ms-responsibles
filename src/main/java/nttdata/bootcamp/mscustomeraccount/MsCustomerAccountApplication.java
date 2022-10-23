package nttdata.bootcamp.mscustomeraccount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsCustomerAccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCustomerAccountApplication.class, args);
	}

}
