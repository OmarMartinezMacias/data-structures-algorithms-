package com.company.Algorhitms;

public class Frame {
    public static void main(String[] args) {
        String[] picture = {"a"};
        String[] picture2 = new String[picture.length + 2];
        String frame = "";

        int index = 0;

        while(picture.length > 0 && index < picture[0].length() + 2){
            frame = frame + "*";
            index++;
        }

        for(int i = 0; i < picture2.length; i++) {
            if(i == 0 || i == picture2.length - 1) {
                picture2[i] = frame;
            } else {
                picture2[i] = "*" + picture[i - 1] + "*";
            }
        }
    }
}
