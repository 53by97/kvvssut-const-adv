/**
 * 
 */
package com.kvvssut.external.proj.spring.service;

import java.util.List;

import com.kvvssut.external.proj.spring.model.PersonGroup;

/**
 * @author Srimanta Sahu
 *
 */
public interface PersonGroupsService {

	public void saveOrUpdate(PersonGroup personGroup);

	public void delete(int personGroupId);

	public PersonGroup get(int personId, int groupId);

	public List<PersonGroup> list();

}
