package org.techhub;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBC_Template_InsertApp_UsingAnnotation {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		JdbcTemplate template = (JdbcTemplate)context.getBean("template");
		template.execute("insert into student values('0','Sakshi','sakshi@gmail.com','6346534355')");
		System.out.println("Record inserted Success......");
	}
}

