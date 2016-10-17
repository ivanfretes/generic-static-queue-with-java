/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticqueues;

import java.util.*;
import excepciones.ColaLlena;
import excepciones.ColaVacia;

/**
 *
 * @author ivan
 */ 
 

public class ColaEstatica<E> implements Queue<E>{
    private int longitud;
    private E[] array; 
    private int frente;
    private int fin;
    
    public ColaEstatica(){
        this.longitud = 10;
        this.array = (E[]) new Object[longitud];
    }
    
    public ColaEstatica(int l){
        this.longitud = l;
        this.array = (E[]) new Object[longitud];
    }

    
    @Override
    public boolean add(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean offer(E e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E poll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E element() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E peek() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return longitud;
    }

    @Override
    public boolean isEmpty() {
        return fin == 0;
        
    }


    @Override
    public boolean contains(Object o){
        if(!isEmpty()){
            for (int i = 0; i < fin; i++) {
                if (o.toString().compareTo(array[i].toString())==0)
                   return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        return array;
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection<? extends E> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection<?> clctn) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void agregar(E e) throws ColaLlena{
        if (longitud == fin){
            throw new ColaLlena();
        }
        else {
            this.array[fin++] = e;
        }
    }
    
    public void eliminar() throws ColaVacia{
        if (this.isEmpty()){
            throw new ColaVacia();
        }
        else {
            array[frente] = null;
            frente++;
        }
    }
    
//    public void mostrar() throws ColaLlena{
//        int i = 0;
//        System.out.println("\n\n<<< MOSTRAR >>>");
//        if(frente == fin)  
//             throw new ColaLlena();
//        
//        for(i = frente; i< fin; i++) {
//            System.out.println("cola["+i+"]="+" "+this.array[i]);
//        }
//        
//        
//        System.out.println("\nFrente= "+frente);
//            System.out.println("Final = "+fin);
//            System.out.println("Max  = "+longitud);
//    }
    
    public E consultar() throws ColaVacia {
        if (isEmpty()) throw new ColaVacia();
        return array[frente];
    }
}
