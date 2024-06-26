package org.shiv;

import org.shiv.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityApplicationDemoProj {
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplicationDemoProj.class,args);
    }
}
