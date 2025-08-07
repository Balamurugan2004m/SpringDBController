package com.example.BalaDb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.BalaDb.Entity.TableEntity;
import com.example.BalaDb.Repos.JpaRepo;
@Service
public class Rpsevice {
 @Autowired
	JpaRepo jr;
 
 public List<TableEntity> method2(){
	 return jr.findAll();
 }
 
 public long method3() {
	 return jr.count();
 }

 public TableEntity method1(TableEntity datas) {
	return  jr.save(datas);
 }

 public Optional<TableEntity> method5(int id) {

	 return jr.findById(id);
			 
 }

 public TableEntity method4(int id, TableEntity newData) {
	
	    TableEntity existing = jr.findById(id).orElseThrow(() -> new RuntimeException("ID not found: " + id));
	    existing.setNames(newData.getNames());
	    existing.setDepartment(newData.getDepartment());
	    existing.setTravel(newData.getTravel());

	    return jr.save(existing);
	    

	    
	}

 
 


 
}
