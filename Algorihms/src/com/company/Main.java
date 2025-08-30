package com.company;

import com.company.Algorhitms.LinkedList.*;
import com.company.Algorhitms.StacksAndQueues.DijstraTwoStacks;
import com.company.Algorhitms.StacksAndQueues.Interviews;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        /*
        //Is unique
		if(IsUnique.StringUnique("aquwirofnve")){
			System.out.println("No repeated characters");
		}else{
			System.out.println("This String has repeated characters");
		}
        */

        // IsUnique.StringUniqueBookSolution("everardo");
        /*
        //Most Repeead Number
        Integer[] array = {1,2,3,4,5,6,7,8,8,8,8,8,8,8,88,8,8,8,8,8,9,9,9,9,9,9,9};
        Integer result = MostRepeteadNumber.mostRepeteadNum(array);

        if(result == null){
            System.out.println("There are not repeead number, or there are more than one");
        }else{
            System.out.println(result);
        }
         */

       /*
        //CheckPermutation
        String string1 = "abce dd";
        String string2 = "dedc ba";

        System.out.println(CheckPermutation.checkPermutationString(string1,string2));
       */
       /*
       //URLIfy
        String string = "Mr John Smith Hola prueba porque          ";
        System.out.println(URLify.StringReplacer(string));
        */

        //ONEWAY
        /*
        System.out.println(OneWay.OneWayChecker("pale", "ple"));
        System.out.println(OneWay.OneWayChecker("pale", "bae"));
        */

        /*
        //String Compresion
        System.out.println(StringCompression.StringCompresor("aabcccccaaa"));
         */

        //Rotate Matrix
        /*
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(RotateMatrix.rotate(matrix));
         */
        /*
       String[] crypt = {"AAAAAAAAAAAAAA","BBBBBBBBBBBBBB", "CCCCCCCCCCCCCC"};
       char[][] solution ={{'A','0'}, {'B','1'}, {'C','2'}};

        System.out.println(IsCryptSolution.isCryptSolutionV2(crypt, solution));
         */
        /*
        //Remove Duplicates
        HashMap<String, Integer> map = new HashMap<>();

        ListNode<String> node1 = new ListNode<String>("F");
        ListNode<String> node2 = new ListNode<String>("A");
        ListNode<String> node3 = new ListNode<String>("A");
        ListNode<String> node4 = new ListNode<String>("F");

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode<String> n = RemoveDuplicates.RemDuplicates(node1,map);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
         /*

        ListNode<String> node1 = new ListNode<String>("F");
        ListNode<String> node2 = new ListNode<String>("A");
        ListNode<String> node3 = new ListNode<String>("A");
        ListNode<String> node4 = new ListNode<String>("F");

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        ListNode<String> n = RemoveDuplicates.RemDuplicateBS(node1);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
        */

        /*
        //Return Last kth
        ListNode<Integer> node1 = new ListNode<Integer>(1);
        ListNode<Integer> node2 = new ListNode<Integer>(2);
        ListNode<Integer> node3 = new ListNode<Integer>(3);
        ListNode<Integer> node4 = new ListNode<Integer>(4);
        ListNode<Integer> node5 = new ListNode<Integer>(5);
        ListNode<Integer> node6 = new ListNode<Integer>(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode<Integer> n = RemoveKthLast.RemoveKthToLast(node1, 4);
        System.out.println(n.value); */

        /*
        //Delete the Middle Element
        //Return Last kth
        ListNode<String> node1 = new ListNode<String>("A");
        ListNode<String> node2 = new ListNode<String>("B");
        ListNode<String> node3 = new ListNode<String>("C");
        ListNode<String> node4 = new ListNode<String>("D");
        ListNode<String> node5 = new ListNode<String>("E");
        ListNode<String> node6 = new ListNode<String>("F");

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        ListNode<String> n = DeleteMiddleElement.DeleteMiddleElement(node1, 0, 0);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
         */

        /*
        //Partition
        ListNode<Integer> node1 = new ListNode<Integer>(3);
        ListNode<Integer> node2 = new ListNode<Integer>(5);
        ListNode<Integer> node3 = new ListNode<Integer>(8);
        ListNode<Integer> node4 = new ListNode<Integer>(5);
        ListNode<Integer> node5 = new ListNode<Integer>(10);
        ListNode<Integer> node6 = new ListNode<Integer>(2);
        ListNode<Integer> node7 = new ListNode<Integer>(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        ListNode<Integer> n = Partition.Partition(node1,5);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
         */

        /*
        //Sum List
        ListNode<Integer> node1 = new ListNode<Integer>(7);
        ListNode<Integer> node2 = new ListNode<Integer>(1);
        ListNode<Integer> node3 = new ListNode<Integer>(6);

        ListNode<Integer> node4 = new ListNode<Integer>(5);
        ListNode<Integer> node5 = new ListNode<Integer>(9);
        ListNode<Integer> node6 = new ListNode<Integer>(2);


        node1.next = node2;
        node2.next = node3;

        node4.next = node5;
        node5.next = node6;

        ListNode<Integer> n = SumLists.SumList(node1, node4,0);
        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
         */

        /*
        //Palindrome
        ListNode<Integer> node1 = new ListNode<Integer>(1);
        ListNode<Integer> node2 = new ListNode<Integer>(1000000000);
        ListNode<Integer> node3 = new ListNode<Integer>(-1000000000);
        ListNode<Integer> node5 = new ListNode<Integer>(-1000000000);
        ListNode<Integer> node6 = new ListNode<Integer>(1000000000);
        ListNode<Integer> node7 = new ListNode<Integer>(1);


        node1.next = node2;
        node2.next = node3;
        node3.next = node5;
        node5.next = node6;
        node6.next = node7;


        System.out.println(Palindrom.Palinrome(node1));
*/
/*
     //Intersection
        ListNode<Integer> node1 = new ListNode<Integer>(7);
        ListNode<Integer> node2 = new ListNode<Integer>(14);
        ListNode<Integer> node3 = new ListNode<Integer>(6);

        ListNode<Integer> node4 = new ListNode<Integer>(5);
        ListNode<Integer> node5 = new ListNode<Integer>(9);
        ListNode<Integer> node6 = new ListNode<Integer>(6);
        ListNode<Integer> node7 = new ListNode<Integer>(1);
        ListNode<Integer> node8 = new ListNode<Integer>(5);

        node1.next = node2;
        node2.next = node3;

        node3.next = node8;

        node4.next = node5;
        node5.next = node6;

        node6.next = node8;

        ListNode<Integer> n = Intersection.Intersection(node1,node4);
        System.out.println(n.value);
*/
/*
System.out.println(5432 / 10000);
        int lenght = Integer.toString(5432).length();
        StringBuilder div = new StringBuilder("1");
        for(int i = 0; i < lenght; i++){
            div.append("0");
        }

        System.out.println(div);

 */
/*
        ListNode<Integer> node1 = new ListNode<Integer>(1);
        ListNode<Integer> node2 = new ListNode<Integer>(2);
        ListNode<Integer> node3 = new ListNode<Integer>(3);
        ListNode<Integer> node5 = new ListNode<Integer>(4);
        ListNode<Integer> node6 = new ListNode<Integer>(5);


        node1.next = node2;
        node2.next = node3;
        node3.next = node5;
        node5.next = node6;
        ListNode<Integer> n = ReverseLiinkList.ReverseList(node1,2);

        while(n != null){
            System.out.println(n.value);
            n = n.next;
        }
        System.out.println(11/3);
    }

 */
/*
        //DijstraTwo
        String eq = "(1+((2+3)*(4*5)))";

        System.out.println(DijstraTwoStacks.DijistraStacks(eq));
    }

 */

        //Interviews
        //String s = "((ng)ipm(ca))";
        //System.out.println(Interviews.StacksAlgo(s));
        //System.out.println(Interviews.StacksAlgo20(s));
    }



    }



