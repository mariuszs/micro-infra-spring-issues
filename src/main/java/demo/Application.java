package demo;

import com.ofg.infrastructure.config.EnableSwaggerDocumentation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@com.ofg.infrastructure.config.EnableMicroservice
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
