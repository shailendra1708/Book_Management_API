package com.shailendra.bookmanagement.Service;

import com.shailendra.bookmanagement.Entity.Book;
import com.shailendra.bookmanagement.Repository.BookReposistory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookReposistory bookReposistory;
    public Book addBook(Book book) {
      return   bookReposistory.save(book);
    }

    public Book getBookByName(String name){
      return bookReposistory.findBookByTitle(name);

    }

    public Book updateBook(Book book) {
        return bookReposistory.save(book);

    }

    public void deleteBook(Integer id) {
        bookReposistory.deleteById(id);
    }
}
