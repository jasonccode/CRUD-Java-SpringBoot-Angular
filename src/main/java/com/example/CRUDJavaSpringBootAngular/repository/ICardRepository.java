package com.example.CRUDJavaSpringBootAngular.repository;

import com.example.CRUDJavaSpringBootAngular.model.Card;


import java.util.List;

public interface ICardRepository {
    public List<Card> findAll();

    public int save(Card card);

    public int update(Card card);

    public int deleteById(int id);

}
