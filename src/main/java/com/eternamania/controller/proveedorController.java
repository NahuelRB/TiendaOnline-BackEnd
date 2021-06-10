package com.eternamania.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.eternamania.entities.Proveedor;
import com.eternamania.service.proveedorServiceImpl;

@RestController
@RequestMapping({"/proveedores"})
public class proveedorController {


	@Autowired
	public proveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/lista")
	public List<Proveedor> listarProveedores(){
		return proveedorServiceImpl.listarProveedores();		
	}
	
	@GetMapping(path= {"/lista/{id_proveedor}"})//({?}) ?= hay que poner el mismo valor de la entidad Proveedor
	public Proveedor listarId(Proveedor proveedor) {
		return proveedorServiceImpl.encontrarProveedor(proveedor);
	}
	
	@PostMapping("/guardar")
	public Proveedor agregarProveedor(@RequestBody Proveedor p){
		return proveedorServiceImpl.guardarProveedores(p);
	}
	
	@DeleteMapping("/eliminar/{id_proveedor}")
	public void eliminarProveedor(Proveedor proveedor) {
		proveedorServiceImpl.eliminarProveedor(proveedor);;
	}
	
	@PutMapping("/editar/{id_proveedor}")//Si no encuentra el id crea uno nuevo hay que verificar
	public Proveedor editarProveedor(@RequestBody Proveedor proveedor,@PathVariable("id_proveedor") int id) {
		return proveedorServiceImpl.editarProveedor(proveedor);
	}
	
	
	
}
