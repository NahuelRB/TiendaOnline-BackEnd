package com.eternamania.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eternamania.dao.*;
import com.eternamania.entities.Proveedor;

@Service
public class proveedorServiceImpl implements proveedorService {

	@Autowired
	public proveedorDao proveedorDao;

	public List<Proveedor> listarProveedores() {
		return proveedorDao.findAll();
	}

	// @Transactional
	public Proveedor guardarProveedores(Proveedor p) {
		return proveedorDao.save(p);
	}

	public Proveedor encontrarProveedor(Proveedor proveedor) {
		return proveedorDao.findById(proveedor.getId_proveedor()).orElse(null);
	}

	public void eliminarProveedor(Proveedor proveedor) {
		proveedorDao.delete(proveedor);
	}

	public Proveedor editarProveedor(Proveedor proveedor) {
		return proveedorDao.save(proveedor);
	}
	
}
