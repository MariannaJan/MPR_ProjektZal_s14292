package domain;


public class User extends Entity {

	private String login;
	private String password;
	private UserRoles userRoles;
	private RolesPermissions rolesPermissions;
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRoles getUserRoles() {
		return userRoles;
	}
	public void setUserRoles(UserRoles userRoles) {
		this.userRoles = userRoles;
	}
	public RolesPermissions getRolesPermissions() {
		return rolesPermissions;
	}
	public void setRolesPermissions(RolesPermissions rolesPermissions) {
		this.rolesPermissions = rolesPermissions;
	}
	
	
}
