package com.nelioalves.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nelioalves.cursomc.domain.Categoria;
import com.nelioalves.cursomc.repositories.CategoriaRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;

import java.util.Optional;

//anotação do Spring
@Service
public class CategoriaService {
	//anotacao do Spring
	@Autowired
	//Declaracao de um objeto do tipo categoria repository
	private CategoriaRepository repo;
	
	// tipo de dado = Categoria, ou Integer ou String, etc
//	public Categoria buscar(Integer id){
//		Categoria obj = repo.findOne(id);
//	}
//	public Categoria find(Integer id) {
//		Optional<Categoria> obj = repo.findById(id);
//		if (obj == null){
//			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
//				+ ", Tipo:" + Categoria.class.getName());
//		}
//		return obj.orElse(null);
//		}
//}

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
		}
}