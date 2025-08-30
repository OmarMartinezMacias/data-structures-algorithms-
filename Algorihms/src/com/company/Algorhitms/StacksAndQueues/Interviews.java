package com.company.Algorhitms.StacksAndQueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

    public class Interviews {
        public static String reverseParentheses(String s) {
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (c == ')') {
                    // Reverses the substring within the innermost pair of parentheses
                    StringBuilder substr = new StringBuilder();
                    while (stack.peek() != '(') {
                        substr.append(stack.pop());
                    }
                    stack.pop(); // Discard '('
                    // Push the reversed substring characters back to the stack
                    for (char reversedChar : substr.toString().toCharArray()) {
                        stack.push(reversedChar);
                    }
                } else {
                    stack.push(c);
                }
            }

            StringBuilder result = new StringBuilder();
            // Construct the result string by popping characters from the stack
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            return result.reverse().toString();
        }

        public static void main(String[] args) {
            String inputStr = "(bar)";
            System.out.println(reverseParentheses(inputStr));  // Output: "rab"

            inputStr = "foo(bar)baz";
            System.out.println(reverseParentheses(inputStr));  // Output: "foorabbaz"

            inputStr = "foo(bar(baz))blim";
            System.out.println(reverseParentheses(inputStr));  // Output: "foobazrabblim"
        }
    }