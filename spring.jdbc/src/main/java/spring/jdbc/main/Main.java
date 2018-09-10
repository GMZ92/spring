package spring.jdbc.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.jdbc.dao.CatTipoFabricaDAO;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		CatTipoFabricaDAO dao = ctx.getBean(CatTipoFabricaDAO.class);
		
		System.out.println(dao.count());
	}
	
}
