package com.bouhouch.gestiondestock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.bouhouch.gestiondestock.model.Quote;

public interface QuoteRepository extends JpaRepository <Quote, Long> {
    @Query("SELECT q FROM Quote q WHERE q.quote LIKE %?1%")
    List<Quote>getContaingQuote(String word);
}
