package mx.com.gnp.demo.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.com.gnp.demo.dto.*;
import mx.com.gnp.demo.services.ContactoServicio;
@RestController
public class ContactoApi {
	@RequestMapping(value="/productor", method=RequestMethod.GET)
	 public Contacto getById(){
		 Contacto contacto =new Contacto();
		 contacto.setFirstName("Bravo");
		 contacto.setId(1L);
		 contacto.setLastName("Unzueta");
		 contacto.setPhoneNumber("5528621726");
		 contacto.setEmail("israelbravo@hotmial.com");
	     return contacto;
	    }

	@Autowired
	ContactoServicio contactService;
	 
	@RequestMapping(value="/contact", method=RequestMethod.POST)
	public Contacto updateOrSave(@RequestBody Contacto contacto){
	    return contactService.save(contacto);
	}
}
