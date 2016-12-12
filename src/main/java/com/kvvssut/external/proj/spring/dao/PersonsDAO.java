/**
 * 
 */
package com.kvvssut.external.proj.spring.dao;

import java.util.List;

import com.kvvssut.external.proj.spring.model.Person;

/**
 * @author Srimanta Sahu
 *
 */
public interface PersonsDAO {

	public void saveOrUpdate(Person person);

	public void delete(int personId);

	public Person get(int personId);

	public List<Person> list();

}
