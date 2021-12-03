package it.netrgoup.corsidiformazionestoredprocedure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import it.netrgoup.corsidiformazionestoredprocedure.entities.Docente;
import it.netrgoup.corsidiformazionestoredprocedure.service.DocenteService;


@RestController
@RequestMapping("api/rest")
public class DocenteController {

	@Autowired 
	DocenteService docenteService;
	
	@GetMapping("/listadocenti")
//	@RequestMapping(value = "/api/listadocenti", method = RequestMethod.GET, produces = "application/json")
	public List<Docente> listaDocenti() {
		return docenteService.findAll();
	}
	
//	@GetMapping("api/insdocenti")	
//	public docenteServise.addDocente(); {
//		return docenteService.insDocente(Docente);
//	}
}
