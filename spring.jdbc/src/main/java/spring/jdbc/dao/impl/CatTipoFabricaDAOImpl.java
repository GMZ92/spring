package spring.jdbc.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import spring.jdbc.dao.CatTipoFabricaDAO;
import spring.jdbc.model.CatTipoFabricaModel;
import spring.jdbc.model.FabricaDetailsRowMapper;


@Repository
public class CatTipoFabricaDAOImpl implements CatTipoFabricaDAO{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public CatTipoFabricaDAOImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public Integer count() {
		
		Integer counter = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM CAT_TIPO_FABRICA", Integer.class);
		
		return counter;
	}

	public List<CatTipoFabricaModel> listPersons() { 
		
		List<CatTipoFabricaModel> userDetails = (List<CatTipoFabricaModel>) jdbcTemplate.query("SELECT idcattipofabrica, nombre, estatus, fechamodificacion, idusuario FROM cat_tipo_fabrica",
				new FabricaDetailsRowMapper());
		return userDetails;
			
	}
	
	
	
}
