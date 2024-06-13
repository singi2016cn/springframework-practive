package top.singi.annotationXmlIoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.singi.annotationXmlIoc.dao.BookDao;
import top.singi.annotationXmlIoc.entity.Book;

@Service
public class BookService {
    @Autowired
    BookDao bookDao;

    public Book getBookById(Long id) {
        return bookDao.findById(id);
    }
}
