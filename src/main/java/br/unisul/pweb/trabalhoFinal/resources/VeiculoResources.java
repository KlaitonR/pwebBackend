package br.unisul.pweb.trabalhoFinal.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import br.unisul.pweb.trabalhoFinal.domain.Veiculo;
import br.unisul.pweb.trabalhoFinal.dtos.VeiculoDTO;
import br.unisul.pweb.trabalhoFinal.services.VeiculoService;

@RestController
@RequestMapping(value="/veiculos")
public class VeiculoResources {

	@Autowired
	private VeiculoService service;
	
	//BUSCAR POR ID
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<Veiculo> find(@PathVariable Integer id){
			Veiculo obj = service.find(id);
			return ResponseEntity.ok().body(obj);
		}
		
		//INSERIR
		@RequestMapping(method=RequestMethod.POST)
		public ResponseEntity<Void>insert(@RequestBody Veiculo obj){
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
					path("/{id}").buildAndExpand(obj.getId()).toUri();
			return ResponseEntity.created(uri).build();
		}

		//ATUALIZAR
		@RequestMapping(value="/{id}", method=RequestMethod.PUT)
		public ResponseEntity<Void> update(@RequestBody Veiculo obj, @PathVariable Integer id){
			obj.setId(id);
			obj = service.update(obj);
			return ResponseEntity.noContent().build();
		}

		
		//EXCLUIR
		@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
		public ResponseEntity<Void> delete(@PathVariable Integer id) {
			service.delete(id);
			return ResponseEntity.noContent().build();
		}
		
		/*
		//LISTAR TODAS
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<VeiculoDTO>> findAll() {
			List<Veiculo> lista = service.findAll();
			//ou for para percorrer a lista
			List<VeiculoDTO> listaDTO = lista.stream().map(obj -> new VeiculoDTO(obj)).collect(Collectors.toList()); 
			return ResponseEntity.ok().body(listaDTO);
		}
		*/
	
}
