package it.netrgoup.corsidiformazionestoredprocedure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.netrgoup.corsidiformazionestoredprocedure.entities.Docente;
import it.netrgoup.corsidiformazionestoredprocedure.repository.DocenteRepository;

@Service
public class DocenteServiceImpl implements DocenteService {

	@Autowired
	private DocenteRepository docenteRepository;
	
	@Override
	public List<Docente> findAll() {
		List<Docente> docenti = docenteRepository.findAll();
		System.out.println(docenti.get(0).getNome());
		return docenti;
	}

	
	
}
