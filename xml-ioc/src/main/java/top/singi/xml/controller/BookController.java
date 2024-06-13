package top.singi.xml.controller;

import top.singi.xml.entity.Book;
import top.singi.xml.service.BookService;

public class BookController {
    BookService bookService;

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    public Book show(Long id) {
        return bookService.getBookById(id);
    }
}
