package top.singi.annotationConfigIoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import top.singi.annotationConfigIoc.entity.Book;
import top.singi.annotationConfigIoc.service.BookService;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    public Book show(Long id) {
        return bookService.getBookById(id);
    }
}
