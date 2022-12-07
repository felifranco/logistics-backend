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

import com.logistics.backend.entity.Entrega;
import com.logistics.backend.interfaces.EntregaRepository;

@RestController
@RequestMapping(path="/entrega")
public class EntregaController {
	
	@Autowired
	private EntregaRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de entrega";
	}
	
	@GetMapping("/list")
	public List<Entrega> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<Entrega> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public Entrega add(@RequestBody Entrega val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public Entrega update(@RequestBody Entrega val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Entrega con Id: " + val + " eliminado.";
	}
}
