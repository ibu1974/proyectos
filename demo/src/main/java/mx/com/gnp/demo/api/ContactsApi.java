package mx.com.gnp.demo.api;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import mx.com.gnp.demo.dto.*;
import mx.com.gnp.demo.services.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsApi {

    
	@RequestMapping(value="/product", method=RequestMethod.GET)
    public Contact getById(){
		Contact  contacto = new Contact();
		contacto.setEmail("israelbravo@hotmail.com");
		contacto.setFirstName("Bravo");
		contacto.setId(1L);
		contacto.setLastName("Unzueta");
		contacto.setPhoneNumber("5528621736");
		
   	return  contacto;
    }

	@Autowired
	ContactService contactService;
	@RequestMapping(value="/cotact", method=RequestMethod.POST)
	public Contact updateOrSave(@RequestBody Contact contact){
		String uno="hola";
		String dos="adios";
		uno.equals(dos);
	    return contactService.save(contact);
	}
	

}
