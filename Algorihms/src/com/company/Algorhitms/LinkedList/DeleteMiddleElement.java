package com.company.Algorhitms.LinkedList;

import com.company.Models.ListNode;

public class DeleteMiddleElement {

    public static ListNode<String> DeleteMiddleElement(ListNode<String> l, int len, int lenR){
         if(l == null){
             return l;
         }else{
             len++;
             l.next = DeleteMiddleElement(l.next,len,lenR);
             lenR++;
             if(len == 2){
                 return l;
             }else{
                 if(lenR == len/2){
                     return l.next;
                 }else{
                     return l;
                 }
             }
         }
    }
}
