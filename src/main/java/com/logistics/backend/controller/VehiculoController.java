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

import com.logistics.backend.entity.Vehiculo;
import com.logistics.backend.interfaces.VehiculoRepository;

@RestController
@RequestMapping(path="/vehiculo")
public class VehiculoController {
	@Autowired
	private VehiculoRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de vehiculo 2";
	}
	
	@GetMapping("/list")
	public List<Vehiculo> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<Vehiculo> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public Vehiculo add(@RequestBody Vehiculo val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public Vehiculo update(@RequestBody Vehiculo val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Vehiculo con Id: " + val + " eliminado.";
	}
}
