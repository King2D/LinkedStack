package com.example.linkedstack;

public class LinkedStack implements Stack {
    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    public void push(String e) {
        Node newNode = new Node(e);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String e = top.data;
        top = top.next;
        size--;
        return e;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public String top() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("(");
        Node current = top;

        while (current != null) {
            result.append(current.data);
            current = current.next;
            if (current != null) {
                result.append(", ");
            }
        }

        result.append(")");
        return result.toString();
    }
}
