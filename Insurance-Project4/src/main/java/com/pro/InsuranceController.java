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
public class InsuranceController {

	@Autowired
	private InsuranceRepo insurance;
	
	//for get all
		@GetMapping("/api/policies")
		public List<Insurance_policy> getAllInsurancePolicy(){
			
			return insurance.findAll();
		}
		
		//for get policy by id
		
		@GetMapping("/api/policies/{id}")
		public Insurance_policy getPolicyById(@PathVariable int id) {
			
			Optional<Insurance_policy> client=insurance.findById(id);
			
			return client.get();
			
		}
		
		
		//create policy
		@PostMapping("/api/policies")
		public Insurance_policy createClient(@RequestBody Insurance_policy client) {
			
			
			return insurance.save(client);
			
		}
		
		//update policy
		
		@PutMapping("/api/policies/{id}")
		public Insurance_policy updateClient(@RequestBody Insurance_policy client,@PathVariable int id) {
			
			
			client.setPolicy_Number(id);
			
			return insurance.save(client);
			
		}
		
		//delete policy
		
		@DeleteMapping("/api/policies/{id}")
		public String deleteClient(@PathVariable int id) {
			
			 insurance.deleteById(id);
			 return "Policy deleted";
			 
			
		}

	
}
