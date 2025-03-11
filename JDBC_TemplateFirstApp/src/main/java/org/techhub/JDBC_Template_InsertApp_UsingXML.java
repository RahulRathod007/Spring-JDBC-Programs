package org.techhub;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class JDBC_Template_InsertApp_UsingXML {

	public static void main(String[] args) {
		Resource r = new ClassPathResource("conn.xml");
		BeanFactory bf = new XmlBeanFactory(r);
		JdbcTemplate template = (JdbcTemplate)bf.getBean("template");
		template.execute("insert into student values('0','laksh','laksh@gmail','7884545443')");
		System.out.println("Record inserted Success...");
	}
}
