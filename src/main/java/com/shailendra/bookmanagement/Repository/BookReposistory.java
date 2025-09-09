package com.shailendra.bookmanagement.Repository;

import com.shailendra.bookmanagement.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookReposistory extends JpaRepository<Book,Integer> {
    public Book findBookByTitle(String Title);
}
