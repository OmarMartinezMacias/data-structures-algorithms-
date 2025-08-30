package com.company.Algorhitms.StacksAndQueues;

import java.util.Stack;

public class DijstraTwoStacks {

    public static Integer DijistraStacks(String eq){
        Stack<String> op = new Stack<>();
        Stack<Integer> number = new Stack<>();

        for(int i = 0; i < eq.length();i++){
            if(eq.charAt(i) == '(');
            else if(eq.charAt(i) == '/'){
                op.push("/");
            }else if(eq.charAt(i) == '+'){
                op.push("+");
            }else if(eq.charAt(i) == '-'){
                op.push("-");
            }else if(eq.charAt(i) == '*'){
                op.push("*");
            }else if(eq.charAt(i) == ')'){
                String o = op.pop();
                Integer n = number.pop();
                Integer result = 0;
                if(o.equals("/")) result = number.pop() / n;
                if(o.equals("+")) result = number.pop() + n;
                if(o.equals("*")) result = number.pop() * n;
                if(o.equals("-")) result = number.pop() - n;
                number.push(result);
            }else{
                number.push(Character.getNumericValue(eq.charAt(i)));
            }
        }
        return number.pop();
    }

}

























































































































































