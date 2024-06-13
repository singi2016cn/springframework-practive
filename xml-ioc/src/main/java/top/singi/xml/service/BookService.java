package top.singi.xml.service;

import top.singi.xml.dao.BookDao;
import top.singi.xml.entity.Book;

public class BookService {
    BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public Book getBookById(Long id) {
        return bookDao.findById(id);
    }
}
