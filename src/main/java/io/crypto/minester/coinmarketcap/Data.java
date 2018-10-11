package io.crypto.minester.coinmarketcap;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Data {

	private double id;
	private String name;
	private String symbol;
	private String slug;
	@JsonProperty("circulating_supply")
	private double circulatingSupply;
	@JsonProperty("total_supply")
	private double totalSupply;
	@JsonProperty("max_supply")
	private double maxSupply;
	@JsonProperty("date_added")
	private Date dateAdded;
	@JsonProperty("num_market_pairs")
	private double numMarketPairs;
	@JsonProperty("cmc_rank")
	private double cmcRank;
	@JsonProperty("last_updated")
	private Date lastUpdated;
	private Quote quote;


}