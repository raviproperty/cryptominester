package io.crypto.minester.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.crypto.minester.mongo.data.CryptoData;
import io.crypto.minester.mongo.data.CryptoRepository;

@RestController()
@RequestMapping("/minester")
@Component
public class CryptoController {
	@Autowired
	CryptoRepository repo;

	public CryptoController(CryptoRepository repo) {
		System.out.println("controller initialized :::");
		this.repo = repo;
	}

	@GetMapping("/all")
	public List<CryptoData> getAllCrypto() {
		List<CryptoData> all = repo.findAll();
		return all;
	}

	@GetMapping("/allpages/{page}")
	public Page<CryptoData> find(@PathVariable("page") int page) {
		Page<CryptoData> pages = repo.findAll(PageRequest.of(page, 100));

		return pages;
	}

}
