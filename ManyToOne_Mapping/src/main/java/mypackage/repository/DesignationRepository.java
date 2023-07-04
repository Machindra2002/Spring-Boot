package mypackage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mypackage.model.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer>{

}
