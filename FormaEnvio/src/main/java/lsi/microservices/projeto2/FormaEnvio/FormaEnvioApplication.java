package lsi.microservices.projeto2.FormaEnvio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FormaEnvioApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormaEnvioApplication.class, args);
	}

}
