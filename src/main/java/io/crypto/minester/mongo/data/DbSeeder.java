package io.crypto.minester.mongo.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import io.crypto.minester.coinmarketcap.JsonToJava;
import io.crypto.minester.coinmarketcap.RootObject;

@Component
public class DbSeeder implements CommandLineRunner {

	private CryptoRepository repo;

	public DbSeeder(CryptoRepository cryptoRepository) {
		this.repo = cryptoRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		RootObject json = JsonToJava.getJsontoJava();

		// List<CryptoData> list = Arrays.asList(new CryptoData("BTC", "Bitcoin",
		// "sha256", "150B", 1.2e20, 1.2e20, "MHs"),
		// new CryptoData("XRP", "Ripple", "rippleAlgo", "100B", 1.2e10, 1.2e10, "MHs"),
		// new CryptoData("ETH", "Etheruem", "Ethash", "90B", 1.2e15, 1.2e15, "MHs")
		//
		// );
		
		//this.repo.deleteAll();
		System.out.println("delete all from mongo");
		//this.repo.saveAll(CryptoData.jsonToCryptoData(json));
		System.out.println("data inserted in mongo");
	}

}
