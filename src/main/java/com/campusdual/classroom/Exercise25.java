package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        String[] elements = new String[]{"Smith", "Montessori", "Peralta", "House"};
        Stack<String> newStack = new Stack<>();
        for (String element : elements) {
            newStack.push(element);
        }
        return newStack;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<String> newStack = createStack();
        printAndEmptyStack(newStack);
    }



}
