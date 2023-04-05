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
public class ClientController {
	
	@Autowired
	private ClientRepo clientRepo;
	
	//for getting all
		@GetMapping("/api/clients")
		public List<Client> getAll(){
			
			return clientRepo.findAll();
			
		}
		
		
		 //for get by id
		@GetMapping("/api/clients/{id}")
		public Client getClientById(@PathVariable int id) {
			
			Optional<Client> client=clientRepo.findById(id);
			
			return client.get();
			
		}
		
		//for creating 
		@PostMapping("/api/clients")
		public Client createClient(@RequestBody Client client) {
			
			
			return clientRepo.save(client);
			
		}
		//for update
		@PutMapping("/api/clients/{id}")
		public Client updateClient(@RequestBody Client client,@PathVariable int id) {
			
			
			client.setId(id);
			
			return clientRepo.save(client);
			
		}
		//for delete
		@DeleteMapping("/api/clients/{id}")
		public String deleteClient(@PathVariable int id) {
			
			 clientRepo.deleteById(id);
			 return "Client deleted";
			
		}

		
		

}
