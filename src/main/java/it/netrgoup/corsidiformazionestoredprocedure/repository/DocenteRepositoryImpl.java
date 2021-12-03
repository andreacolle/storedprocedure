package it.netrgoup.corsidiformazionestoredprocedure.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import it.netrgoup.corsidiformazionestoredprocedure.entities.Docente;

@Repository
public class DocenteRepositoryImpl implements DocenteRepository {

	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Docente>findAll() {
		
		StoredProcedureQuery query = em
				.createStoredProcedureQuery("SP_LISTADOCENTI");

		query.execute();
		
		List<Object[]> docente = new ArrayList();
				docente = query.getResultList();

		List<Docente> docenti = new ArrayList<Docente>();
		if (docente.size() > 0)
		{
			
			for(int i = 0; i < docente.size(); i++) {
				Docente odocente = new Docente((String)docente.get(i)[0], (String)docente.get(i)[1], (String)docente.get(i)[2], (java.math.BigDecimal)docente.get(i)[3]);
				docenti.add(odocente);
			}

		}

		return docenti;
	}
	
	
}
