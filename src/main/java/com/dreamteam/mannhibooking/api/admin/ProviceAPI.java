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
@RequestMapping("/api")
public class ProviceAPI {
	
	@Autowired
	private ProviceService proviceService ;
	
	@PostMapping(value = "/provice")
	public ProviceDTO createNew(@RequestBody ProviceDTO model){
		return proviceService.save(model);
	}
	
	@PutMapping(value = "/provice/{id}")
	public ProviceDTO updateNew(@RequestBody ProviceDTO model, @PathVariable("id") long id){
		model.setId(id);
		return proviceService.save(model);
	}
	
	/*
	 * @DeleteMapping(value = "/new") public void deleteNew(@RequestBody long[] ids)
	 * { proviceService.delete(ids); }
	 */

}
