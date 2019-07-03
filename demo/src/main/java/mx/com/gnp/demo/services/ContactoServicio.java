package mx.com.gnp.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.gnp.demo.dao.ContactoRepositorio;
import mx.com.gnp.demo.dto.Contacto;

@Service
public class ContactoServicio {
	@Autowired
	ContactoRepositorio dao;
	public Contacto save(Contacto contacto){
        return dao.saveAndFlush(contacto);
    }
}
