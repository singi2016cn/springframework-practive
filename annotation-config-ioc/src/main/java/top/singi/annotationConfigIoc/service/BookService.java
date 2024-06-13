package top.singi.annotationConfigIoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.singi.annotationConfigIoc.dao.BookDao;
import top.singi.annotationConfigIoc.entity.Book;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public Book getBookById(Long id) {
        return bookDao.findById(id);
    }
}
