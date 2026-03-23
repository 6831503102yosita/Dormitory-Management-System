package service;

// Generics
public interface Manageable<T> {
    void add(T item);
    void remove(int index);
    void showAll();
}