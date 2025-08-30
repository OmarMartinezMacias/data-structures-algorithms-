package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

public class Intersection {

    public static ListNode<Integer> Intersection(ListNode<Integer> l1, ListNode<Integer> l2){

        ListNode<Integer> head1 = l1;
        ListNode<Integer> head2 = l2;
        ListNode<Integer> tail1 = null;
        ListNode<Integer> tail2 = null;

        int head1C = 0;
        int head2C = 0;

        while(head1!= null && head2                != null){
            if(head1 != null){
                head1C++;
                if(head1.next == null){
                    tail1 = head1;
                }
                head1 = head1.next;

            }
            if(head2 != null){
                head2C++;
                if(head2.next == null){
                    tail2 = head2;
                }
                head2 = head2.next;
            }
        }

        System.out.println(tail1.value + " " + tail2.value);

        if(tail1.equals(tail2)){
            while(l1 != null && l2 != null){
                if(head1C > head2C){
                    head1C++;
                    l1 = l1.next;
                }else if(head2C > head1C){
                    head2C++;
                    l2 = l2.next;
                }else{
                    if(l1.equals(l2)){
                        return l1;
                    }else{
                        l1 = l1.next;
                        l2 = l2.next;
                    }
                }
            }
        }else{
            return null;
        }
   return null;
    }
}
