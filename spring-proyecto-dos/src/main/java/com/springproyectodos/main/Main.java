package com.springproyectodos.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springproyectodos.business.Programmer;

/**
 * Clase Main
 *
 * @author Netasystems / Gonzalo
 * @version 1.0.0 Fecha 05/09/2018
 *
 */
public class Main {

    /**
     * Método main
     *<p></p>
     *
     * @param args
     */
    public static void main(String[] args) {
    	
        System.out.println("Ejercicio #2 de Spring");
        
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Programmer prgm1 = context.getBean("gonzaloProgrammer", Programmer.class);
        Programmer prgm2 = context.getBean("masterProgrammer", Programmer.class);
        
        System.out.println("El programador #1: " + prgm1.hacktheWordId());
        System.out.println("El programador #2: " + prgm2.hacktheWordId());
    }
    
}
