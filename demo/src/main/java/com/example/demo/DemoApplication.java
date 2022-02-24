package com.example.demo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args){
		String date = LocalDate
		.parse("2014-05-04")
		.format(DateTimeFormatter.ISO_LOCAL_DATE) ;
		System.out.println(date);
		}

}
