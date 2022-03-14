package com.qilinger.blog

import net.sf.jsqlparser.expression.DateTimeLiteralExpression
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

@SpringBootTest
class BlogApplicationTests {

	@Test
	fun contextLoads() {
		var df = DateFormat.getDateInstance()
		df.calendar.set(2019,4,20)

		var l = Date().time-df.calendar.time.time
		var d = l/ (1000 * 60 * 60 * 24)
		print(d)
	}

}
