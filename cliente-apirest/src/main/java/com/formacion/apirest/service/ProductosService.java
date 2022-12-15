package com.formacion.apirest.service;

import java.util.List;

import com.formacion.apirest.entity.Cliente;
import com.formacion.apirest.entity.Producto;
import com.formacion.apirest.entity.Region;

public interface ProductosService {

	//metodo para mostrar todos los Producto
		public List<Producto> mostrarProductos();
		
		//metodo que busque Producto por id
		public Producto buscarProducto(long id);
		
		//metodo para crear un nuevo Producto
		public Producto guardarProducto(Producto producto);
		
		//metodo para borrar un Producto
		public Producto borrarProducto(long id);
		
		
}
