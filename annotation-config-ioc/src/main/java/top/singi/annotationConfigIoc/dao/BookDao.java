package top.singi.annotationConfigIoc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import top.singi.annotationConfigIoc.entity.Book;

@Repository
public class BookDao {
    
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Book findById(Long id) {
        return jdbcTemplate.queryForObject("select * from book where id = ? limit 1", new BeanPropertyRowMapper<Book>(Book.class), id);
    }

}
