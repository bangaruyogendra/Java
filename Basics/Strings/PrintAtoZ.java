package Basics.Strings;

import java.util.Arrays;

public class PrintAtoZ {
    public static void main(String[] args) {
        // String series = "";
        // for(int i=0;i<26;i++){
        //     char ch =(char)('a'+i);
        //     series += ch;
        // } 
        // // Here everytime assigning ch to series it creates new string object it leads to space complexity more so we can use String builder
        // // String Builder is assigning each ch to same object to wont create everytime new object
        // System.out.println(series);
        StringBuilder builder =new StringBuilder();
        for(int i=0;i<26;i++){
               char ch =(char)('a'+i);
               builder.append(ch);
             } 
       System.out.println(builder.toString());
       String name = "Balu Yogendra";
       System.out.println(Arrays.toString(name.toCharArray()));
       //strip usful for removing extra spaces from string
       System.out.println("    balu".strip());
    }
}
