package com.example.BalaDb.Controller;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BalaDb.Entity.TableEntity;
import com.example.BalaDb.Service.Rpsevice;

@RequestMapping("/startweb")
@RestController("/rpfirst")
public class RpController {
 
	@Autowired
	Rpsevice rs;
	
	@GetMapping("/getAll")
	public List<TableEntity> method2(){
		return rs.method2();
	} 
	
	
	
	@GetMapping("/count")
	public long method3() {
		return rs.method3();
	}

	
 @PostMapping("/posts")
	public TableEntity method1(@RequestBody TableEntity   detail) {
		return rs.method1(detail);
	}
 
 @GetMapping("/getid/{ids}")
 public Optional<TableEntity> method5(@PathVariable (value="ids") int id) {
	 return rs.method5(id);
 }
 
 @PutMapping("/put/{ids}")
 public TableEntity method6(@PathVariable (value="ids") int id,@RequestBody TableEntity new_data){
	 return rs.method4(id,new_data);
 }
	
} 
