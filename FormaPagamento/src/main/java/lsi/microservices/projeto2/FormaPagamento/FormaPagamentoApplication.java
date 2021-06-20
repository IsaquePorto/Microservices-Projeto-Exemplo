package lsi.microservices.projeto2.FormaPagamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class FormaPagamentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FormaPagamentoApplication.class, args);
	}

}
