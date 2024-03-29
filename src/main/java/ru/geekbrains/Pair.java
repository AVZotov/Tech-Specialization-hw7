package ru.geekbrains;

public class Pair <K, V>{
    private final K k;
    private final V v;

    public Pair(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getFirst(){
        return k;
    }

    public V getSecond(){
        return v;
    }

    @Override
    public String toString() {
        return (k.toString() + "-" + v.toString());
    }
}
