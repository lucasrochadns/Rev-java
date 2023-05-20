package br.com.projeto.capitulo19.services;

import java.util.ArrayList;
import java.util.List;
public class PrintService<T> {

    private List<T> lista = new ArrayList<>();
    public void addValue(T t){
        lista.add(t);
    }
    public T first (){
        if(lista.isEmpty()){
            throw new IllegalStateException("List is empty");
        }
        return lista.get(0);
    }
    public void print(){
        lista.stream().forEach(System.out::println);
    }

}
