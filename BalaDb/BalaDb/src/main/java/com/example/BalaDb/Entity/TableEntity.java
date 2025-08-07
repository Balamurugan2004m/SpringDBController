package com.example.BalaDb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="std_details")
public class TableEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="s_no")
	private int s_no;
	 
	@Column(name="st_name")
    private String names;
	
	@Column(name="st_depart")
	private String department;
   
	@Column(name="travel")
	private String travel;

	public int getS_no() {
		return s_no;
	}

	public void setS_no(int s_no) {
		this.s_no = s_no;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTravel() {
		return travel;
	}
	
	

	public void setTravel(String travel) {
		this.travel = travel;
	}
	
	
	
}
