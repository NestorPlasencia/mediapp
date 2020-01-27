package com.mitocode.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.model.Examen;
import com.mitocode.repo.IExamenRepo;
import com.mitocode.service.IExamenService;

@Service
public class ExamenServiceImpl implements IExamenService {
	
	@Autowired
	private IExamenRepo repo;

	@Override
	public Examen registrar(Examen exa) {
		return repo.save(exa);
	}

	@Override
	public Examen modificar(Examen exa) {
 		return repo.save(exa);
	}

	@Override
	public List<Examen> listar() {
		return repo.findAll();
	}
	
	@Override
	public Examen leerPorId(Integer id) {
		Optional<Examen> op = repo.findById(id);
		return op.isPresent( ) ? op.get() : new Examen();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}
	
}