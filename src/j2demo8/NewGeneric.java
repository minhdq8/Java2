/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2demo8;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author minhdq
 */
public class NewGeneric<K, V> {
    private K key;
    private V value;

    public NewGeneric(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }    
}

class KVExample{
    public static void main(String[] args) {
        NewGeneric<String,Double> test1 = new NewGeneric<>("java2",9.5);
        
    }
}