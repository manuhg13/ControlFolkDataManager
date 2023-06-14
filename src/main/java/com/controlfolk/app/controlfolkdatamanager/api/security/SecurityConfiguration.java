package com.controlfolk.app.controlfolkdatamanager.api.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@EnableWebFluxSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityWebFilterChain securityWebFilterChain(ServerHttpSecurity http){
        http.authorizeExchange(SecurityConfiguration::configRoutes)
                .oauth2ResourceServer(SecurityConfiguration::configOAuth2ResourceServer);
        return http.build();
    }

    private static void configRoutes(ServerHttpSecurity.AuthorizeExchangeSpec authorizeExchangeSpec){
        authorizeExchangeSpec.anyExchange().authenticated();
    }

    private static void configOAuth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec resourceServerSpec){
        resourceServerSpec.jwt(Customizer.withDefaults());
    }
}
