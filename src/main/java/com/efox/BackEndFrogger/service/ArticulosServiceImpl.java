package com.efox.BackEndFrogger.service;

import com.efox.BackEndFrogger.dao.ArticulosDao;
import com.efox.BackEndFrogger.dao.UsuarioDao;
import com.efox.BackEndFrogger.domain.Articulos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArticulosServiceImpl implements ArticulosService{

    @Autowired // Inyecta la instancia de la clase el objeto
    private ArticulosDao ArticulosDao;
  
    @Transactional(readOnly=true)//Solamente va a consultar la base de datos
    public List<Articulos> listarArticulos() {
         return (List<Articulos>) ArticulosDao.findAll();
    }
 
}
