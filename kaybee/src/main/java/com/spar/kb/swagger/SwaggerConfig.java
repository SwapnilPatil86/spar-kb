package com.spar.kb.swagger;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
    public Docket api() { 
		
		Contact contact = new Contact("Swapnil Patil", "", "swapnil.patil@sparsolutions.com");
		List<VendorExtension> vendorExtensions = new ArrayList<>();

		ApiInfo apiInfo = new ApiInfo("Knowledge Base API", "", "1.0",
				"https://sparsolutions.com/", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", vendorExtensions);
		
        return new Docket(DocumentationType.SWAGGER_2)
        		.apiInfo(apiInfo)
        		.select()                                  
        		.apis(RequestHandlerSelectors.any())              
        		.paths(PathSelectors.any())                          
        		.build();                                           
    }		
}