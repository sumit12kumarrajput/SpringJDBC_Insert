package com.becoder.SpringJDBC_insert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.xml.Jdbc4SqlXmlHandler;

import in.sr.resources.SpringConfigurationfile;

public class App 
{
    public static void main( String[] args )
    {
//    	int id=101;
//    	String name="Sumit";
//    	int marks=80;
        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfigurationfile.class);
        JdbcTemplate jdbcTemplate= context.getBean(JdbcTemplate.class);
        String query="insert into student values(103,'Gaurav',97)";
        int i=jdbcTemplate.update(query);
        if(i>0) {
        	System.out.println("Success");
        }
        else {
        	System.out.println("Failed");
        }
    }
}
