package com.lvl6.aoc2.entitymanager.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lvl6.aoc2.entitymanager.UserEntityManager;
import com.lvl6.aoc2.po.User;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-cassandra.xml")
public class TestUserEntityManager {

	@Autowired
	protected UserEntityManager um;
	
	public UserEntityManager getUm() {
		return um;
	}

	public void setUm(UserEntityManager um) {
		this.um = um;
	}

	@Test
	public void testCreatingUser() {
		User user = new User();
		user.setEmail("anyone@anyserver.com");
		user.setUserName("someUser");
		um.get().put(user);
		User user2 = um.get().get(user.getId());
		assertTrue("Usernames equal", user.getUserName().equals(user2.getUserName()));
		assertTrue("Emails equal", user.getEmail().equals(user2.getEmail()));
	}
}
