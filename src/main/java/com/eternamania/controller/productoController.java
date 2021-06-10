package com.eternamania.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.eternamania.service.*;

import com.eternamania.entities.Producto;
import com.eternamania.entities.Proveedor;

@RestController
@RequestMapping({"/productos"})
public class productoController {
		
	@Autowired
	public productoServiceImpl productoServiceImpl;
	
	
	@GetMapping("/lista")
	public List<Producto> listarProducto(){
		return productoServiceImpl.listarProductos();
		
	}
	
	@GetMapping(path={"/lista/{id_producto}"})
	public Producto listarProductoId(Producto producto) {
		return productoServiceImpl.encontrarProducto(producto);
	}
	
	@PostMapping("/guardar")
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}

}
