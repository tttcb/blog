package com.qilinger.blog.config

import com.qilinger.blog.BlogApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

@Configuration
@EnableSwagger2
class swaggerConfig {

    @Bean
    fun api(): Docket {
        val docket = Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select() // 选择那些路径和api会生成document
            // .apis(RequestHandlerSelectors.any()) // 对所有api进行监控
            .apis(RequestHandlerSelectors.basePackage("com.qilinger"))
            .paths(PathSelectors.any()) // 对所有路径进行监控
            .build()
        return docket
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("麒麟儿博客")
            // 版本号
            .version(BlogApplication.version )
            .description("").build()
    }
}