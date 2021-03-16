package com.hashtables;

public class Node<T, V extends Comparable>{
    T data;
    V value;
    Node next;

    public Node(T data, V value) {
        this.data = data;
        this.value = value;
        this.next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<T,V> getNext() {
        return next;
    }

    public void setNext(Node<T,V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder mapNodeString = new StringBuilder();
        mapNodeString.append("Map Node{" + "K=").append(data).append(" V=")
                             .append(value).append('}');
        if (next != null)
            mapNodeString.append("->").append(next);
        return mapNodeString.toString();
    }
}
