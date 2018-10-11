/**
 * 
 */
package io.crypto.minester.mongo.data;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import io.crypto.minester.coinmarketcap.Data;
import io.crypto.minester.coinmarketcap.RootObject;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author none
 *
 */
@Document(collection = "CryptoData")
@AllArgsConstructor
@Getter
@Setter
public class CryptoData {
	@Id
	@Indexed(direction = IndexDirection.ASCENDING)
	String symbol;

	String Name;
	String algorithm;
	Double marketCap;

	Double networkHashrate;
	Double difficulty;
	String hashrateUnit;

	public static List<CryptoData> jsonToCryptoData(RootObject json) {

		List<CryptoData> list = new ArrayList<CryptoData>();
		for (Data d : json.getData()) {

			CryptoData crypto = new CryptoData(d.getSymbol(), d.getSlug(), "", d.getQuote().getUsd().getMarketCap(),
					0.0, 0.0, "");
			list.add(crypto);

		}
		System.out.println("cryptodata list size ::::" + list.size());
		return list;
	}

}
