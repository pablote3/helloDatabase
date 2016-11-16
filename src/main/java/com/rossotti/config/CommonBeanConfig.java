package com.rossotti.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.rossotti.repository")
public class CommonBeanConfig {



}
