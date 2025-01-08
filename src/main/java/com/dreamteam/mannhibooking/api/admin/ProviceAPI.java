package com.dreamteam.mannhibooking.api.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dreamteam.mannhibooking.dto.ProviceDTO;
import com.dreamteam.mannhibooking.service.ProviceService;

@RestController
@RequestMapping("/api/provice")
public class ProviceAPI {
	
	@Autowired
	private ProviceService proviceService ;
	
	@PostMapping
	public ProviceDTO createProvice(@RequestBody ProviceDTO model){
		return proviceService.create(model);
	}
	
	@PutMapping(value = "/{id}")
	public ProviceDTO updateProvice(@RequestBody ProviceDTO model, @PathVariable("id") long id){
		model.setId(id);
		return proviceService.update(model.getId(),model);
	}
	
	@PutMapping(value = "/delete/{id}")
	public void updateValidFlagProvice(@RequestBody ProviceDTO model, @PathVariable("id") long id){
		model.setId(id);
       
        proviceService.deleteProvice(model.getId());
	}
	
	/*
	 * @DeleteMapping(value = "/new") public void deleteNew(@RequestBody long[] ids)
	 * { proviceService.delete(ids); }
	 */

}
