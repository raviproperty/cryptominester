package io.crypto.minester.mongo.data;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface CryptoRepository extends MongoRepository<CryptoData, String> {
	
public Page<CryptoData> findAll(Pageable arg0);

}
