package com.assignment.contact.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.assignment.contact.entity.contacts;

@Repository
public interface contactRepository extends JpaRepository<contacts,String> {
    @Query("SELECT u FROM contacts u WHERE u.phoneNumber = ?1")
	public contacts findByphoneNumber(String pnum);

}
