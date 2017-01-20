package mapperTests;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.mockito.Mockito;
import org.testng.Assert;
import org.testng.annotations.Test;

import domain.User;
import mappers.UserMapper;

public class UserMapperTest extends Mockito{

	@Test
	public void test() throws SQLException {
		
		UserMapper sut = new UserMapper();
		ResultSet rs = mock(ResultSet.class);
		
		when(rs.getInt("id")).thenReturn(21);
		when(rs.getString("login")).thenReturn("Luxor");
		when(rs.getString("password")).thenReturn("Test1234@");

		
		User user = sut.map(rs);
		
		Assert.assertEquals(user.getId(), 21);
		Assert.assertEquals(user.getLogin(), "Luxor");
		Assert.assertEquals(user.getPassword(), "Test1234@");
		
		
	}

}
