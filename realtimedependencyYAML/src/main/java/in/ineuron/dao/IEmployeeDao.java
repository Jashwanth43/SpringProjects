package in.ineuron.dao;

import java.util.List;

import in.ineuron.bo.EmployeeBO;


public interface IEmployeeDao {
	String save(EmployeeBO bo);
	List<EmployeeBO> findAllEmployees();
	EmployeeBO findById(Integer eid);
	String updateByiId(Integer eid);
	String deleteByiId(Integer eid);
}
