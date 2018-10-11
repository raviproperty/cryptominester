package io.crypto.minester.coinmarketcap;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Status {
	private Date timestamp;

	private int error_code;

	private Object error_message;
	private int elapsed;
	private int credit_count;
}



