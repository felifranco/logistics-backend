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

import com.logistics.backend.entity.CentroDistribucion;
import com.logistics.backend.interfaces.CentroDistribucionRepository;

@RestController
@RequestMapping(path="/centro-distribucion")
public class CentroDistribucionController {
	
	@Autowired
	private CentroDistribucionRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de centro-distribucion";
	}
	
	@GetMapping("/list")
	public List<CentroDistribucion> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<CentroDistribucion> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public CentroDistribucion add(@RequestBody CentroDistribucion val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public CentroDistribucion update(@RequestBody CentroDistribucion val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Centro de distribución con Id: " + val + " eliminado.";
	}

}
