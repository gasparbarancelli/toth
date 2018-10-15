package br.com.toth.blog.config;

import org.asciidoctor.Asciidoctor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static org.asciidoctor.Asciidoctor.Factory.create;

@Configuration
public class AsciidoctorConfig {

    @Bean
    public Asciidoctor asciidoctor() {
        return create();
    }

}
