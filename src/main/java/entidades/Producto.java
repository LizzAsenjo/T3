/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Liz
 */
public class Producto extends Tienda implements Registrador, Consultador{
    
    private String nombre;
    private String precio;

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
    
    @Override
    public String getNombre(){
        return "PRODUCTO : " + nombre + "        " + "PRECIO : " + precio;
    }
    
    @Override
    public void Registrador() {
       
    }

    @Override
    public void SolicitarPrecios() {
       
    }

    @Override
    public void BuscarPrecios() {
        
    }

    @Override
    public void BuscarNombreProd() {
       
    }
}
