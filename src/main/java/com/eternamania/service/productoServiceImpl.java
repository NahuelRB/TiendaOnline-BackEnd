package com.eternamania.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eternamania.entities.Producto;
import com.eternamania.dao.*;

@Service
public class productoServiceImpl implements productoService{

	@Autowired
	public productoDao productoDao;
	
	public List<Producto> listarProductos(){
		return productoDao.findAll();
		
	}

	public Producto guardarProducto(Producto p) {
		return productoDao.save(p);
	}

	public Producto encontrarProducto(Producto producto) {
		return productoDao.findById(producto.getId_producto()).orElse(null);
	}

	public void eliminarProducto(Producto producto) {
		productoDao.delete(producto);
	}

	public Producto editarProducto(Producto producto) {
		return productoDao.save(producto);
	}

	
	
}
