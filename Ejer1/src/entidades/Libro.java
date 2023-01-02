/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Facundo
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String numeroPaginas;
    
    public Libro(){    
}
    
    public Libro(String isbn, String titulo, String autor, String numeroPaginas){
        this.isbn=isbn;
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;       
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPaginas(String numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }
        
    
    
}
