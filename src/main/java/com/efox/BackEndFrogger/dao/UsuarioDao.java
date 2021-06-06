package com.efox.BackEndFrogger.dao;

import com.efox.BackEndFrogger.domain.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository<Usuario, Integer> {

    //public Page<Usuario> findAll(java.awt.print.Pageable pageable);

    //public Page<Usuario> findAll(java.awt.print.Pageable pageable);
    
}
