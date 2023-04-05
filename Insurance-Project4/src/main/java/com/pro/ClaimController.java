package com.pro;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ClaimController {
	
	@Autowired
	private ClaimRepo claimRepo;
	
	//for get all 
	
		@GetMapping("/api/claims")
		public List<Claim> getAllInsurancePolicy(){
			
			return claimRepo.findAll();
		}
		
		//for get by id
		@GetMapping("/api/claims/{id}")
		public Claim getPolicyById(@PathVariable int id) {
			
			Optional<Claim> client=claimRepo.findById(id);
			
			return client.get();
			
		}
		
		//create claims
			@PostMapping("/api/claims")
			public Claim createClient(@RequestBody Claim client) {
				
				
				return claimRepo.save(client);
				
			}
			
			//update claims
			
			@PutMapping("/api/claims/{id}")
			public Claim updateClient(@RequestBody Claim client,@PathVariable int id) {
				
				 
				client.setClaim_Number(id);
				
				return claimRepo.save(client);
				
			}
			
			
			//delete policy
			
			@DeleteMapping("/api/claims/{id}")
			public String deleteClient(@PathVariable int id) {
				
				 claimRepo.deleteById(id);
				 return "Claims deleted";
				 
				
			}

	

}
