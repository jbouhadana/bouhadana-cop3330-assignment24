/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */

package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.println("Enter the first string:");
        String string1 = jb.nextLine();
        System.out.println("Enter the second string:");
        String string2 = jb.nextLine();
        boolean sonk= isAnagram(string1, string2);
        if (sonk)
        {
            System.out.println(string1 + " and " + string2 + " are anagrams.");
        }
        else
        {
            System.out.println(string1 + " and " + string2 + " are not anagrams.");
        }

    }

    public static boolean isAnagram(String one, String two)
    {
        if(one.length() == 0 || two.length() == 0 || one.length() != two.length())
        {
            return false;
        }
        int soooonk = 0;
        for(int i = 0; i < one.length(); i++)
        {
            for(int j = 0; j < two.length(); j++) {
                char theOne = one.charAt(i);
                char theSec = two.charAt(j);
                if (theOne == theSec) {
                    soooonk++;
                    break;
                }
            }
            if (soooonk != i+1)
            {
                return false;
            }
        }
        return true;
    }
}

