package com.formacion.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.apirest.entity.Cliente;
import com.formacion.apirest.entity.Producto;
import com.formacion.apirest.entity.Region;
import com.formacion.apirest.repository.ClienteRepository;
import com.formacion.apirest.repository.ProductosRepository;

@Service
public class ProductosServiceImpl implements ProductosService{

	@Autowired
	private ProductosRepository repositorio;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> mostrarProductos() {
		return (List<Producto>) repositorio.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Producto buscarProducto(long id) {
		return repositorio.findById(id).orElse(null);
	}

	@Override
	@Transactional
	public Producto guardarProducto(Producto producto) {
		return repositorio.save(producto);
	}

	@Override
	@Transactional
	public Producto borrarProducto(long id) {
		Producto productoBorrado = buscarProducto(id);
		repositorio.deleteById(id);
		
		return productoBorrado;
		
		
	}

}
