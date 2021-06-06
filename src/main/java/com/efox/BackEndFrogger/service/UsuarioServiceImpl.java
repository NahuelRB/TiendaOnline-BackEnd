package com.efox.BackEndFrogger.service;

import com.efox.BackEndFrogger.dao.UsuarioDao;
import com.efox.BackEndFrogger.domain.Usuario;
import java.awt.print.Pageable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    @Autowired // Inyecta la instancia de la clase el objeto
    private UsuarioDao usuarioDao;
       
    @Transactional(readOnly=true)//Solamente va a consultar la base de datos
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) usuarioDao.findAll();
    }
    
    /*public Page<Usuario> usuariosPageable(Pageable pageable){
        return usuarioDao.findAll(pageable);
    }*/

 
}
