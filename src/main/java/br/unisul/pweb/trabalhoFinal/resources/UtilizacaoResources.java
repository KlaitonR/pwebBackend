package br.unisul.pweb.trabalhoFinal.resources;

import java.net.URI;
import java.util.Date;
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
import br.unisul.pweb.trabalhoFinal.domain.Utilizacao;
import br.unisul.pweb.trabalhoFinal.dtos.UtilizacaoDTO;
import br.unisul.pweb.trabalhoFinal.services.UtilizacaoService;

@RestController
@RequestMapping(value="/utilizacoes")
public class UtilizacaoResources {
	
	@Autowired
	private UtilizacaoService service;
	
		//BUSCAR POR ID
		@RequestMapping(value="/{id}",method=RequestMethod.GET)
		public ResponseEntity<Utilizacao> find(@PathVariable Integer id){
			Utilizacao obj = service.find(id);
			return ResponseEntity.ok().body(obj);
		}
		
		//INSERIR
		@RequestMapping(method=RequestMethod.POST)
		public ResponseEntity<Void>insert(@RequestBody Utilizacao obj){
			obj = service.insert(obj);
			URI uri = ServletUriComponentsBuilder.fromCurrentRequest().
					path("/{id}").buildAndExpand(obj.getId()).toUri();
			return ResponseEntity.created(uri).build();
		}

		//ATUALIZAR
		@RequestMapping(value="/{id}", method=RequestMethod.PUT)
		public ResponseEntity<Void> update(@RequestBody Utilizacao obj, @PathVariable Integer id){
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
		
		//LISTAR TODAS
		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<List<UtilizacaoDTO>> findAll() {
			List<Utilizacao> lista = service.findAll();
			List<UtilizacaoDTO> listaDTO = lista.stream().map(obj -> new UtilizacaoDTO(obj)).collect(Collectors.toList()); 
			return ResponseEntity.ok().body(listaDTO);
		}
				
		//FILTRAR POR DATA
		@RequestMapping(value="/utilizacoes/data",method=RequestMethod.GET)
		ResponseEntity<List<Utilizacao>> findDistinctByDataContainingOrderByData(@PathVariable Date data) {
			List<Utilizacao> list = service.OrdenarPorData(data);
			return ResponseEntity.ok().body(list);
		}
}
