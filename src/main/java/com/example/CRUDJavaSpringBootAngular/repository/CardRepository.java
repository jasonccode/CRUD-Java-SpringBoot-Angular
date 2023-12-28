package com.example.CRUDJavaSpringBootAngular.repository;

import com.example.CRUDJavaSpringBootAngular.model.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardRepository implements ICardRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Card> findAll() {
        String POSTGRES = "SELECT * FROM cards WHERE status = 1";
        return jdbcTemplate.query(POSTGRES, BeanPropertyRowMapper.newInstance(Card.class));
    }

    @Override
    public int save(Card card) {
        String POSTGRES = "INSERT INTO cards (name, number, type, cvv, status) VALUES (?, ?, ?, ?, ?)";
        return jdbcTemplate.update(POSTGRES, card.getName(), card.getNumber(), card.getType(), card.getCvv(), card.getStatus());
    }

    @Override
    public int update(Card card) {
        String POSTGRES = "UPDATE cards SET name=?, number=?, type=?, cvv=?, status=? WHERE id_card=?";
        return jdbcTemplate.update(POSTGRES, card.getName(), card.getNumber(), card.getType(), card.getCvv(), card.getStatus(), card.getId_card());
    }

    @Override
    public int deleteById(int id) {
        String POSTGRES = "UPDATE cards SET status = 0 WHERE id_card = ?";
        return jdbcTemplate.update(POSTGRES, new Object[]{id});
    }
}
