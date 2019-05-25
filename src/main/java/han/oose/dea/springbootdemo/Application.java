package han.oose.dea.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ServletComponentScan
@SpringBootApplication(scanBasePackages = "han.oose.dea.springbootdemo")
@EnableJpaRepositories("han.oose.dea.springbootdemo.dao")
@EntityScan("han.oose.dea.springbootdemo.model")

public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
