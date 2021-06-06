package com.efox.BackEndFrogger.dao;

import com.efox.BackEndFrogger.domain.Articulos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticulosDao extends JpaRepository<Articulos, Integer> {
    
}
