package com.eternamania.service;

import java.util.List;
import com.eternamania.entities.Producto;
import com.eternamania.entities.Proveedor;

public interface productoService {

	public List<Producto> listarProductos();
	
	public Producto guardarProducto(Producto p);
	
	public Producto encontrarProducto(Producto producto);
	
	public void eliminarProducto(Producto producto);
	
	public Producto editarProducto(Producto producto);
	
}
