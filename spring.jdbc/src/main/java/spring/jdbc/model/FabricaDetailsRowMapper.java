package spring.jdbc.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class FabricaDetailsRowMapper implements RowMapper<CatTipoFabricaModel> {

	public CatTipoFabricaModel mapRow(ResultSet rs, int row) throws SQLException {
		
		CatTipoFabricaModel catTipoFabricaModel = new CatTipoFabricaModel();
		
		catTipoFabricaModel.setIdCatTipoFabrica(rs.getInt("idcattipofabrica"));
		catTipoFabricaModel.setNombre(rs.getString("nombre"));
		catTipoFabricaModel.setStatus(rs.getCharacterStream("estatus"));
		catTipoFabricaModel.setEmail(rs.getString("email"));
		catTipoFabricaModel.setDob(rs.getString("dob"));
		
		return catTipoFabricaModel;
	}

}
