package fr.me.samuel.test.cqrs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class CqrsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CqrsApplication.class, args);
    }

    @Controller
    class SwaggerWelcome {
        @GetMapping({ "/", "" })
        public String redirectToUi() {
            return "redirect:/swagger-ui.html";
        }
    }

}
