package io.crypto.minester.coinmarketcap;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJava {

	public static RootObject getJsontoJava() throws IOException {

		URL url = new URL("https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?start=1&limit=5000");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-CMC_PRO_API_KEY", "c22d1059-e1ad-46a0-8e9e-8867aec5a5cb");

		conn.connect();

		if (conn.getResponseCode() != 200) {
			System.out.println(conn.getResponseCode());
			throw new RuntimeException("Error reading data from CMC");

		}

		// create ObjectMapper instance
		ObjectMapper mapper = new ObjectMapper();
		RootObject rootObject = mapper.readValue(conn.getInputStream(), RootObject.class);

		System.out.println("rootObject data size++ " + rootObject.getData().size());
		return rootObject;
	}

	public static void main(String[] args) throws Exception {
		URL url = new URL("https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest?start=1&limit=5000");

		HttpURLConnection conn = (HttpURLConnection) url.openConnection();

		conn.setRequestMethod("GET");
		conn.setRequestProperty("X-CMC_PRO_API_KEY", "c22d1059-e1ad-46a0-8e9e-8867aec5a5cb");

		conn.connect();

		if (conn.getResponseCode() != 200) {
			System.out.println(conn.getResponseCode());
			throw new RuntimeException("Error reading data from CMC");

		}

		// create ObjectMapper instance
		ObjectMapper mapper = new ObjectMapper();
		RootObject value = mapper.readValue(conn.getInputStream(), RootObject.class);

		System.out.println(value.getStatus().toString());

		// convert json string to object
		// Employee emp = objectMapper.readValue(jsonData, Employee.class);
	}
}
