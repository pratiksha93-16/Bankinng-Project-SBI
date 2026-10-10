package sbi.banking.connection;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.sql.SQLException;

public class CreateServiceTest {
	@org.junit.Test
	public void createTest() throws IOException, SQLException {
		CreateService c1=new CreateService();
		boolean req=true;
		boolean actual=c1.create();
		assertEquals(req,actual);
	}

}
