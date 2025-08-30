package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

import java.util.Stack;

public class Palindrom {

    public static boolean Palinrome(ListNode<Integer> l) {

        Stack<Integer> s = new Stack<>();
        int length = 0, count = 0;

        ListNode<Integer> head = l;

        while (l != null) {
            s.push(l.value);
            l = l.next;
            length++;
        }

        while (head != null) {

            count++;
            if(length % 2 != 0){

                if (count == (length / 2) + 1) {
                   return true;
                }
            }

            if(head.value.equals(s.pop())){
                return false;
            }
          head = head.next;
        }

        return true;
    }
}
