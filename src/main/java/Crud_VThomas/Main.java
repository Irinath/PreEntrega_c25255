package Crud_VThomas;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        final ArrayList<Producto> productos = new ArrayList<>();
        final ArrayList<Categoria> categorias = new ArrayList<>();

        //Instancio Categoría Agregando items al ArrayList
        categorias.add(new Categoria("Componentes"));
        categorias.add(new Categoria("Insumos"));
        categorias.add(new Categoria("Computadoras"));
        categorias.add(new Categoria("Periféricos"));
        categorias.add(new Categoria("Portátiles"));
        categorias.add(new Categoria("Impresoras"));
    }
}
