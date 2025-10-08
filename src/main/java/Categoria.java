public class Categoria {
    private int id;
    private String nombre;

    //Contador estático
    private static int contador = 0;

    //Constructores
    public Categoria(String nombre){
        this.id = contador++;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


}
