package com.swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2   //开启swagger2
public class SwaggerConfig {

    @Bean
    public Docket docket1(){
//        如何配置多个分组;多个Docket实例即可
        return new Docket(DocumentationType.SWAGGER_2).groupName("A");
    }
    @Bean
    public Docket docket2(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("B");
    }
    @Bean
    public Docket docket3(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("C");
    }

    //配置了Swagger 的Docket 的bean实例
    @Bean
    public Docket docket(Environment environment){

        //设置要显示的profiles环境
        //要在配置文件里配置profiles=dev才会生效，会换端口
//        Profiles profiles = Profiles.of("dev","test");

        //获得项目的环境：
        //通过environment.acceptsProfiles 判断是否在自己的设定环境当中
//        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
//                .enable(flag)   //是否启动swagger，默认为TRUE
                .groupName("wjl")   //配置API文档的分组
                //select到build是一个整体
                .select()
                // RequestHandlerSelectors，配置要扫描接口的方式
                // basePackage:指定要扫描的包
                // any():扫描全部
                // none():不扫描
                // withClassAnnotation:扫描类上的注解，参数是一个注解的反射对象
                // withMethodAnnotation:扫描方法上的注解 .apis(RequestHandlerSelectors.withMethodAnnotation(GetMapping.class))
                .apis(RequestHandlerSelectors.basePackage("com.swagger.controller"))
                //过滤路径
                //.paths(PathSelectors.ant("/wjl/**"))   只扫描带有wjl下的接口
                .build();
    }

    //配置swagger信息==apiInfo
    private ApiInfo apiInfo(){

        //作者信息
        Contact contact = new Contact("wjl","","1261083341@qq.com");

        return new ApiInfo("wjl的swaggerAPI文档",
                "学习无止境",
                "1.0",
                "urn:tos",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
