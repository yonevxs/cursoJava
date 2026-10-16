package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {
	
	// Implementação do DAO de Department
	// Não há necessidade de colocar public antes do tipo de retorno dos métodos, por padrão é public
	void insert(Department obj);
	void update(Department obj);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
}
