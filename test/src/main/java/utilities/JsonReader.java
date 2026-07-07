package utilities;

import io.qameta.allure.internal.shadowed.jackson.databind.ObjectMapper;
import model.Herokuappcustomer;
import java.io.File;

public class JsonReader {
	public static Herokuappcustomer getdata() {
		try {
			ObjectMapper mapper=new ObjectMapper();
			return mapper.readValue(new File("src/main/java/testdata/testdata.json"),Herokuappcustomer.class);
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

}
