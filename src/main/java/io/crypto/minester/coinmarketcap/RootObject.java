package io.crypto.minester.coinmarketcap;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RootObject {
	private Status status;
	private ArrayList<Data> data;
}