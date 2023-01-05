package com.bouhouch.gestiondestock.model;

import javax.persistence.*;

@Entity
@Table(name = "quotes")
public class Quote {
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quoteID")
    private Long id;

    public Long getId() {
        return id;
    }

    @Column(name = "quote_string")
    private String quote;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

}
