package com.example.BalaDb.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BalaDb.Entity.TableEntity;

public interface JpaRepo extends JpaRepository<TableEntity ,Integer>{

}
