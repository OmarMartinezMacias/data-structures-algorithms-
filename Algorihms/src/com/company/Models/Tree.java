package com.company.Models;

public class Tree<T> {
    public Tree(T x){
        value = x;
    }

    public T value;
    public Tree<T> left;
    public Tree<T> right;
}
