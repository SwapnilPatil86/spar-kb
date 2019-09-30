package com.spar.kb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KnowledgeBase{

	public static void main( String[] args ) {
    	SpringApplication.run(KnowledgeBase.class, args);
        System.out.println( "Spring Boot Application by Swapnil!" );
    }

}
