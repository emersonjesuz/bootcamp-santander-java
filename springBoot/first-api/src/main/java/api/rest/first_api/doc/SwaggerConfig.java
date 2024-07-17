// package api.rest.first_api.doc;

// import java.util.Arrays;
// import java.util.HashSet;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.Contact;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {

// private Contact contact() {
// return new Contact("Josiemerson teixeira",
// "https://github.com/emersonjesuz",
// "https://github.com/JoséLuis/first-api");
// }

// private ApiInfoBuilder apiInfoBuilder() {
// ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
// apiInfoBuilder
// .title("My API")
// .description("My API description")
// .version("1.0")
// .license("Apache License Version 2.0")
// .licenseUrl("https://www.apache.org/licenses/LICENSE-2.0")
// .contact(contact());
// return apiInfoBuilder;
// }

// @Bean
// public Docket api() {
// Docket docket = new Docket(DocumentationType.SWAGGER_2);

// docket.select()
// .apis(RequestHandlerSelectors.basePackage("api.rest.first_api.controller"))
// .paths(PathSelectors.any())
// .build()
// .apiInfo(this.apiInfoBuilder().build())
// .consumes(new HashSet<String>(Arrays.asList("application/json")))
// .produces(new HashSet<String>(Arrays.asList("application/json")));
// return docket;

// }
// }
