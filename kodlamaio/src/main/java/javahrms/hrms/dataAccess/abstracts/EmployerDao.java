package javahrms.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javahrms.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer,Integer> {
	
	boolean existsEmployerByEmail(String email);

}
