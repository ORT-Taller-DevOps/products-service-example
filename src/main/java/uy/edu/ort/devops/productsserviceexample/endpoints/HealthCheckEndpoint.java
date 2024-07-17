package uy.edu.ort.devops.paymentsserviceexample.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthCheckEndpoint {

    @GetMapping()
    public String healthCheck() {
        return "OK";
    }
}