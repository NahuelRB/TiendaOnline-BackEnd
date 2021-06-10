package com.eternamania.service;

import java.util.List;

import com.eternamania.entities.Proveedor;


public interface proveedorService {

	public List<Proveedor> listarProveedores();
	
	public Proveedor guardarProveedores(Proveedor p);
	
	public Proveedor encontrarProveedor(Proveedor proveedor);
	
	public void eliminarProveedor(Proveedor proveedor);
	
	public Proveedor editarProveedor(Proveedor proveedor);
	
}
