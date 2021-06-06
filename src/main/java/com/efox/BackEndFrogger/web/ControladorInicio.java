    package com.efox.BackEndFrogger.web;

import com.efox.BackEndFrogger.dao.UsuarioDao;
import com.efox.BackEndFrogger.domain.Articulos;
import com.efox.BackEndFrogger.domain.Usuario;
import com.efox.BackEndFrogger.service.ArticulosService;
import com.efox.BackEndFrogger.service.UsuarioService;
import com.efox.BackEndFrogger.service.UsuarioServiceImpl;
import java.awt.print.Pageable;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //A diferencia de Controller con este me evito tener que utilizar ResponseBody
@Slf4j
public class ControladorInicio {
    
    @Autowired
    public UsuarioServiceImpl usuarioService;
      
    @Autowired
    public ArticulosService ArticulosService;
    
   /* @RequestMapping("/listPageable")
    public Page<Usuario> usuarioPageable(Pageable pageable){
        return usuarioService.usuariosPageable(pageable);
    }*/
    
    @RequestMapping("/usuarios")
    public List<Usuario> listar(){
        return usuarioService.listarUsuarios();
    }
        
     @GetMapping("/hola")
    public String hola(){
        return "Hola mundo";
    }
    
    /*//Articulos
    @RequestMapping("/articulo")
    public String listaArticulos(Model model){
        
        return "index";
    }*/
    
    @RequestMapping("/articulos")
    public List<Articulos> listarArticulo(){
        return ArticulosService.listarArticulos();
    }
    
}
