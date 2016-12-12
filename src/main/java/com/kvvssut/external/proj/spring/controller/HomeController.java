/**
 * 
 */
package com.kvvssut.external.proj.spring.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kvvssut.external.proj.spring.model.Group;
import com.kvvssut.external.proj.spring.service.GroupsService;

/**
 * @author Srimanta Sahu
 *
 */
@Controller
public class HomeController {

	@Autowired
	private GroupsService groupsService;

	@RequestMapping(value = "/allgroups")
	public ModelAndView listGroups(ModelAndView modelAndView) throws IOException {
		List<Group> groupsList = groupsService.list();
		modelAndView.addObject("groupsList", groupsList);
		modelAndView.setViewName("home");
		return modelAndView;
	}

	@RequestMapping(value = "/newgroup", method = RequestMethod.GET)
	public ModelAndView newGroup(ModelAndView modelAndView) {
		Group group = new Group();
		modelAndView.addObject("group", group);
		modelAndView.setViewName("AddGroupFrom");
		return modelAndView;
	}

	@RequestMapping(value = "/saveGroup", method = RequestMethod.POST)
	public ModelAndView saveGroup(@ModelAttribute Group group) {
		groupsService.saveOrUpdate(group);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteGroup", method = RequestMethod.DELETE)
	public ModelAndView deleteContact(HttpServletRequest request) {
		int groupId = Integer.parseInt(request.getParameter("group_id"));
		groupsService.delete(groupId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editGroup", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		int groupId = Integer.parseInt(request.getParameter("group_id"));
		Group group = groupsService.get(groupId);
		ModelAndView modelAndView = new ModelAndView("AddGroupFrom");
		modelAndView.addObject("group", group);
		return modelAndView;
	}

}
