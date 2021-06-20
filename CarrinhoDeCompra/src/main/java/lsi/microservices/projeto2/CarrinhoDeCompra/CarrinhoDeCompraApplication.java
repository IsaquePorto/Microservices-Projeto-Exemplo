package lsi.microservices.projeto2.CarrinhoDeCompra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CarrinhoDeCompraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarrinhoDeCompraApplication.class, args);
	}

}
