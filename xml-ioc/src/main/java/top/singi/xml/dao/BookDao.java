package top.singi.xml.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import top.singi.xml.entity.Book;

public class BookDao {
    
    JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Book findById(Long id) {
        return jdbcTemplate.queryForObject("select * from book where id = ? limit 1", new BeanPropertyRowMapper<Book>(Book.class), id);
    }

}
