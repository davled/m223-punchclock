package ch.zli.m223.punchclock.config;

import ch.zli.m223.punchclock.PunchclockApplication;
import ch.zli.m223.punchclock.repository.RoomRepository;
import ch.zli.m223.punchclock.service.CategoryService;
import ch.zli.m223.punchclock.service.RoomService;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Also see https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-cors
 */
@Configuration
public class WebConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }

    /*@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }*/

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }



    @Bean
    public CategoryService categoryService() {return new CategoryService();}

    @Bean
    public RoomService roomService() {return new RoomService();}
}
