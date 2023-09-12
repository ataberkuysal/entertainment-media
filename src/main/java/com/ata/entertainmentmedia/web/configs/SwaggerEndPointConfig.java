package com.ata.entertainmentmedia.web.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
//@EnableSwagger2
//@EnableWebMvc
public class SwaggerEndPointConfig {

    // BELOW SWAGGER CONFIG LIMITS ENDPOINTS ONLY TO THE SPECIFIED PACKAGE
    // BY REMOVING spring-boot-starter-data-rest, SPRING'S AUTO CONFIGURATION OF CREATING DEFAULT ENTITY CONTROLLERS HAS BEEN DISABLED
    // CHANGE IF NEEDED WITH OTHER EXISTING CONFIG OPTIONS
    // https://stackoverflow.com/questions/40263595/how-to-hide-repository-controller-from-swagger-ui
    // CHANGE THIS TO JAVADOC

    /*@Bean
    public Docket swaggerSpringMvcPlugin(){
        return new Docket( DocumentationType.SWAGGER_2 )//
                .select().apis( RequestHandlerSelectors.basePackage( "com.ata.entertainmentmedia.web.controllers" ) )
                .build();
    }*/
}