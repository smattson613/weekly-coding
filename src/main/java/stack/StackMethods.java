package stack;

import java.util.Stack;

public class StackMethods {

    public static Stack<Integer> stack = new Stack<>();

    public static Stack<Integer> maxValue = new Stack<>();

    public static void pushValue(Integer value) {
        stack.push(value);
        if (maxValue.size() == 0) {
            maxValue.push(value);
        } else if (value > maxValue.lastElement()) {
            maxValue.push(value);
        }
    }

    public static int popValue() {
        if (stack.size() > 0) {
            int lastElement = stack.lastElement();
            System.out.println(lastElement);
            if (maxValue.lastElement().equals(lastElement)) {
                maxValue.pop();
            }
            stack.pop();
            return lastElement;
        } else {
            throw new RuntimeException("No values in stack");
        }
    }

    public static Integer maxValue() {
        if (maxValue.size() == 0) {
            throw new RuntimeException("No values in stack");
        } else {
            return maxValue.lastElement();
        }
    }

    public static void main(String[] args) {
        pushValue(5);
        pushValue(1);
        pushValue(2);
        pushValue(6);
        pushValue(3);
        pushValue(4);
        pushValue(9);
        pushValue(23);
        pushValue(7);
        pushValue(8);
        System.out.println(stack);
        System.out.println(maxValue);
        popValue();
        popValue();
        popValue();
        popValue();
        popValue();
        System.out.println(stack);
        System.out.println(maxValue);
        System.out.println(maxValue());
    }
}
