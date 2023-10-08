package com.example.linkedstack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new LinkedStack();
        stack.push("CHN");
        stack.push("JPN");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        stack.push("MNL");
        stack.push("USA");
        System.out.println(stack.top());
        stack.push("RUS");
        System.out.println(stack.size());
        System.out.println(stack.pop());
        stack.push("THA");
        stack.push("ILG");
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}