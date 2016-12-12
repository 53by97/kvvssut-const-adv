/**
 * 
 */
package com.kvvssut.external.proj.spring.service;

import java.util.List;

import com.kvvssut.external.proj.spring.model.Person;

/**
 * @author Srimanta Sahu
 *
 */
public interface PersonsService {

	public void saveOrUpdate(Person person);

	public void delete(int personId);

	public Person get(int personId);

	public List<Person> list();

}
