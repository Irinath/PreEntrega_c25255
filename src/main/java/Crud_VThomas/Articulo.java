package Crud_VThomas;
public class Articulo {

    String nombre;
    int idArticulo;
    float precio;
    int stock;


    //Constructores para la clase Artículo
    public Articulo(int idArticulo, String nombre, float precio, int stock){
        this.idArticulo;
        this.nombre;
        this.stock;
        this.precio;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;

    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}