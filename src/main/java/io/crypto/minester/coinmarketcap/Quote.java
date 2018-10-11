package io.crypto.minester.coinmarketcap;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Quote {

    @JsonProperty("USD")
    private Usd usd;
    

}