package mx.com.gnp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import mx.com.gnp.demo.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
