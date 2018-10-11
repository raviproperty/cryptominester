package io.crypto.minester.coinmarketcap;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/*
 * Time: 2018-10-10 12:3:44 @author freecodeformat.com @website
 * http://www.freecodeformat.com/json2javabean.php
 */
public class Usd {

	private double price;
	@JsonProperty("volume_24h")
	private double volume24h;
	@JsonProperty("percent_change_1h")
	private double percentChange1h;
	@JsonProperty("percent_change_24h")
	private double percentChange24h;
	@JsonProperty("percent_change_7d")
	private double percentChange7d;
	@JsonProperty("market_cap")
	private double marketCap;
	@JsonProperty("last_updated")
	private Date lastUpdated;

}