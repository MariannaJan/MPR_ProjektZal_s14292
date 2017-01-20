/*package createTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class Test_createTables extends TestNG {
	
	Connection con = null;
    Statement stmt = null;
    int result = 0;
	
	@Test
	public void createTable_t_sys_users(){
	      try {
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");
	         stmt = con.createStatement();
	         
	         result = stmt.executeUpdate("CREATE TABLE t_sys_users ("
	         		+ "id INT NOT NULL, "
	         		+ "login VARCHAR(255) NOT NULL, "
	         		+ "password VARCHAR(255) NOT NULL, "
	         		+ "PRIMARY KEY (id));"
	        		);
				
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	      System.out.println("Table t_sys_users created successfully");
	}
	
	@Test
	public void createTable_t_sys_permissions(){
	      try {
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");
	         stmt = con.createStatement();
	         
	         result = stmt.executeUpdate("CREATE TABLE t_sys_permissions ("
	         		+ "permissionId INT NOT NULL, "
	         		+ "roleId INT NOT NULL, "
	         		+ "PRIMARY KEY (permissionId));"
	        		);
				
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	      System.out.println("Table t_sys_permissions created successfully");
	}
	
	@Test
	public void createTable_t_sys_roles(){
	      try {
	         Class.forName("org.hsqldb.jdbc.JDBCDriver");
	         con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/workdb", "SA", "");
	         stmt = con.createStatement();
	         
	         result = stmt.executeUpdate("CREATE TABLE t_sys_roles ("
	         		+ "userId INT NOT NULL, "
	         		+ "roleId INT NOT NULL, "
	         		+ "PRIMARY KEY (roleId));"
	        		);
				
	      }  catch (Exception e) {
	         e.printStackTrace(System.out);
	      }
	      System.out.println("Table t_sys_permissions created successfully");
	}

}
*/