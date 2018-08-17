package com.jeff.boot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <p>
 * swagger 整合管理API接口
 * 参考<url href="http://www.jianshu.com/p/8033ef83a8ed">http://www.jianshu.com/p/8033ef83a8ed</url>
 * </p>
 * @author jeff
 * @date 2017-02-26 20:12
 * @since 1.8
 * @version 1.0.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.jeff"))
                .paths(PathSelectors.any())
                .build();
    }


    Contact contact = new Contact("jeff", "http://localhost:8080/swagger-ui.html", "youpengzhang@163.com");
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("Swagger API 接口文档")
                .contact(contact)
                .version("1.1.1")
                .build();
    }
}
