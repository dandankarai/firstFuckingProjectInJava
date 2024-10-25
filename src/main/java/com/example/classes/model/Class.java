package com.example.classes.model;

import jakarta.persistence.*;

@Entity
@Table(name = "classes")
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "year_publication") // Nome da coluna adequado
    private int yearPublication;

    // Construtor padrão (necessário para o JPA)
    public Class() {
    }

    // Construtor com argumentos
    public Class(String title, String author, int yearPublication, String isbn) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
        this.isbn = isbn;
    }

    // Getters e Setters
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Class [id=" + id + ", title=" + title + ", author=" + author + ", yearPublication=" + yearPublication + ", isbn=" + isbn + "]";
    }
}
