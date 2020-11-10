package javacore.homework18.task2;

import java.util.HashMap;
import java.util.Map;


public class MyEntry<K,V> {

    K key;
    V value;
    Map<K, V> map = new HashMap<>();

    public void setA(K k) {
        this.key = k;
    }

    public void setB(V v) {
        this.value = v;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    void add(K key, V value){
        map.put(key, value);
    }
    void removeByKey(K key){
        map.remove(key);
    }
    void removeByValue(V value) {
        map.values().removeIf(v -> v.equals(value));
    }
    void displayKeys(){
        System.out.println(map.keySet());
    }
    void displayValues(){
        System.out.println(map.values());
    }
    void displayMap(){
        System.out.println(map);
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }


}
