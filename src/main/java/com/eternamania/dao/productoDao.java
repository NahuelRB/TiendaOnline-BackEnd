package com.eternamania.dao;

import com.eternamania.entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface productoDao extends JpaRepository <Producto, Integer> {

	
	
}
