package systementor.orderservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/order")
    public String getOrder() {
        String customer =  restTemplate
                .getForObject("http://localhost:8080/customer", String.class);
        return customer;
    }
}
