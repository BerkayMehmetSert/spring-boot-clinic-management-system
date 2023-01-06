package com.bms.clinicmanagementsystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI(@Value("${application.title}") String title,
                                 @Value("${application.description}") String appDescription,
                                 @Value("${application.version}") String appVersion,
                                 @Value("${application.license}") String appLicense,
                                 @Value("${application.license.url}") String appLicenseUrl,
                                 @Value("${application.termsOfServiceUrl}") String termsOfService) {
        return new OpenAPI()
                .info(new Info()
                        .title(title)
                        .version(appVersion)
                        .description(appDescription)
                        .termsOfService(termsOfService)
                        .license(new License().name(appLicense).url(appLicenseUrl)));
    }
}
