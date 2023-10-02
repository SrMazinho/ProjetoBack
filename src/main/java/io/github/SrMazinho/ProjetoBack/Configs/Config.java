package io.github.SrMazinho.ProjetoBack.Configs;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(name = "aplicationname")
    public String aplicationname()
    {
        return "Banco digital";
    }


}
