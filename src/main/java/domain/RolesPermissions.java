package domain;

import java.util.ArrayList;
import java.util.List;

public class RolesPermissions extends Entity {

	private String name;
	private List<UserRoles> userRoles;
	private User user;

	public RolesPermissions()
	{
		userRoles = new ArrayList<UserRoles>();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserRoles> getRoles() {
		return userRoles;
	}

	public void setRoles(List<UserRoles> roles) {
		this.userRoles = roles;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
