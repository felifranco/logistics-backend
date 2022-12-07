package com.logistics.backend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.logistics.backend.entity.TipoProducto;
import com.logistics.backend.interfaces.TipoProductoRepository;

@RestController
@RequestMapping(path="/tipo-producto")
public class TipoProductoController {
	@Autowired
	private TipoProductoRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de tipo-producto";
	}
	
	@GetMapping("/list")
	public List<TipoProducto> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<TipoProducto> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public TipoProducto add(@RequestBody TipoProducto val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public TipoProducto update(@RequestBody TipoProducto val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Tipo producto con Id: " + val + " eliminado.";
	}
}
