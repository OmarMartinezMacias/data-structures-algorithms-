package com.company.Algorhitms;

public class TimeFormat {

    public static void main(String args[]) {
        String s = "12:40:22AM";
        int firstTwoDigits = Integer.parseInt(s.substring(0, 2));
        if(s.indexOf("PM") != -1 && firstTwoDigits < 12){
            s = String.valueOf(firstTwoDigits + 12) + s.substring(2, s.length());
        }else {
            if(s.indexOf("AM") != -1 && firstTwoDigits == 12){
                s = "00" + s.substring(2, s.length());
            }
        }

        System.out.println(s.substring(0, s.indexOf("M") - 1));
    }


}
