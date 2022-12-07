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

import com.logistics.backend.entity.TipoCentroDistribucion;
import com.logistics.backend.interfaces.TipoCentroDistribucionRepository;

@RestController
@RequestMapping(path="/tipo-centro-distribucion")
public class TipoCentroDistribucionController {
	@Autowired
	private TipoCentroDistribucionRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de tipo-centro-distribucion";
	}
	
	@GetMapping("/list")
	public List<TipoCentroDistribucion> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<TipoCentroDistribucion> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public TipoCentroDistribucion add(@RequestBody TipoCentroDistribucion val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public TipoCentroDistribucion update(@RequestBody TipoCentroDistribucion val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Tipo centro de distribución con Id: " + val + " eliminado.";
	}
}
