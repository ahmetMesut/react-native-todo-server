package com.nativetodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.nativetodo")
@EntityScan("com.nativetodo.model")
public class ReactNativeTodoServerApplication {


    public static void main(String[] args) {
        SpringApplication.run(ReactNativeTodoServerApplication.class, args);
    }

    @Bean
    public HibernateJpaSessionFactoryBean sessionFactory() {
        return new HibernateJpaSessionFactoryBean();
    }
}
