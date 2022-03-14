package com.qilinger.blog

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication
import org.springframework.context.ConfigurableApplicationContext

@SpringBootApplication
@MapperScan("com.qilinger.blog.mapper")
class BlogApplication{
	companion object {
	const val version = "2021.6.16"
	lateinit var context: ConfigurableApplicationContext
}
}

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
