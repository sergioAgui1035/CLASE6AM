package TALLERPREPARATORIO.Modelos;

import java.math.BigDecimal;

public class Libro {
    
    public String titulo;
    public String autor;
    public BigDecimal precio;
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

}
