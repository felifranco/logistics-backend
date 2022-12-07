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

import com.logistics.backend.entity.TipoVehiculo;
import com.logistics.backend.interfaces.TipoVehiculoRepository;

@RestController
@RequestMapping(path="/tipo-vehiculo")
public class TipoVehiculoController {
	@Autowired
	private TipoVehiculoRepository repo;
	
	@GetMapping()
	public String Welcome() {
		return "Bienvenido al CRUD de tipo-vehiculo";
	}
	
	@GetMapping("/list")
	public List<TipoVehiculo> list() {
		return repo.findAll();
	}
	
	@GetMapping("/{val}")
	public Optional<TipoVehiculo> getById(@PathVariable Integer val) {
		return repo.findById(val);
	}
	
	@PostMapping("/add")
	public TipoVehiculo add(@RequestBody TipoVehiculo val) {
		return repo.save(val);
	}
	
	@PutMapping("/update")
	public TipoVehiculo update(@RequestBody TipoVehiculo val) {
		return repo.save(val);
	}

	@DeleteMapping("/delete/{val}")
	public String delete(@PathVariable Integer val) {
		repo.deleteById(val);
		return "Tipo vehiculo con Id: " + val + " eliminado.";
	}
}
