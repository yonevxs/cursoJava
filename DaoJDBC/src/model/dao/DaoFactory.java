package model.dao;

import db.DB;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
	// Possui operações estáticas para instanciar os DAOS
	
	// Dessa forma, a classe expoe um método que retorna o TIPO da interface, mas internamente instancia uma implementação
	// Isso é uma técnica para não expor a implementação, deixando somente a interface
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection());
	}
}
