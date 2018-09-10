package spring.jdbc.dao;

import java.util.List;

import spring.jdbc.model.CatTipoFabricaModel;

public interface CatTipoFabricaDAO {
	
	Integer count();
	
	List<CatTipoFabricaModel> listPersons();

}
