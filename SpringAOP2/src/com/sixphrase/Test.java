package com.sixphrase;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
					
					Operation e=(Operation) context.getBean("oneBean");
					System.out.println("calling msg...");
					e.msg();
					System.out.println("calling m...");
					e.print();
					System.out.println("calling k...");
					e.display();
					

		}

	}