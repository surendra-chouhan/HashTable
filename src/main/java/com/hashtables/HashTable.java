package com.hashtables;

public class HashTable<T extends Comparable, V extends Comparable> {
    LinkedList<T> linkedList;

    public HashTable() {
        this.linkedList = new LinkedList<>();
    }

    public V get(T data) {
        Node<T,V> node = this.linkedList.searchNode(data);
        if(node == null)
            return null;
        else
            return node.getValue();
    }

    public void add(T data, V value){
        Node<T,V> node = this.linkedList.searchNode(data);
        if(node == null){
            node = new Node(data, value);
            this.linkedList.insertAtBack(node);
        }
        else{
            node.setValue(value);
        }
    }

    public void deleteGivenNode(T data){
        Node temp = this.linkedList.head;
        Node previous = null;

        if (temp != this.linkedList.head && temp.data == data){
            this.linkedList.head = temp.next;
            return;
        }

        while(temp != null && temp.data != data){
            previous = temp;
            temp = temp.next;
        }

        if (temp == null){
            return;
        }
        previous.next = temp.next;
    }

    @Override
    public String toString() {
        return "HashTable{" +  linkedList + '}';
    }
}
