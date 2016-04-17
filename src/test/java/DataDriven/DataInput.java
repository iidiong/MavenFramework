package DataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataInput {
	
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][3];

		data[0][0] = "abcd";
		data[0][1] = "xxxx";
		data[0][2] = "1aaa";

		data[1][0] = "abcd";
		data[1][1] = "xxxx";
		data[1][2] = "1aaa";

		data[2][0] = "abcd";
		data[2][1] = "xxxx";
		data[2][2] = "1aaa";

		return data;
	}

	@Test(dataProvider = "getData")
	public void userIdGeneration(String username, String password, String id) {
		System.out.println("This is test with parameters");
		System.out.println(username);
		System.out.println(password);
		System.out.println(id);
	}
}
