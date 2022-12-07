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

import com.logistics.backend.entity.Cliente;
import com.logistics.backend.interfaces.ClienteRepository;

@RestController
@RequestMapping(path="/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de Cliente";
	}
	
	@GetMapping("/list")
	public List<Cliente> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<Cliente> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public Cliente add(@RequestBody Cliente val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public Cliente update(@RequestBody Cliente val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Cliente con Id: " + val + " eliminado.";
	}
}
