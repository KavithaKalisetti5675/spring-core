package basics.config;

import basics.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
* */
@Configuration
public class ProjectConfig {

    @Bean("Audi")
    Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("Audi 9");
        return veh;
    }

    /*
    The method names usually follow verbs notation.But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practise as the method names will become
    bean names as well in the context.
    * */
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }
}
