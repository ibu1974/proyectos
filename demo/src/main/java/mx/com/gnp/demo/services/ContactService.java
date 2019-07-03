package mx.com.gnp.demo.services;
import mx.com.gnp.demo.dto.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.gnp.demo.dao.ContactRepository;

@Service
public class ContactService {
    @Autowired
    ContactRepository dao;
    public Contact save(Contact contact){
        return dao.saveAndFlush(contact);
    }    
}
