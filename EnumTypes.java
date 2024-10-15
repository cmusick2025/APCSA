/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.enumtypes;
import java.util.*;
import java.text.*;
/**
 *
 * @author cmusick2025
 */
public class EnumTypes {

    public static void main(String[] args) {
        //Create enumeration of days in a week
        enum Day {Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday};
        //Print them all out
        //Print out day number rather than zero based ordinal
        System.out.println("Day of the week: " + Day.Sunday);
        System.out.println("Day Number: " + (Day.Sunday.ordinal() + 1));
        System.out.println("Day of the week: " + Day.Monday);
        System.out.println("Day Number: " + (Day.Monday.ordinal() + 1));
        System.out.println("Day of the week: " + Day.Tuesday);
        System.out.println("Day Number: " + (Day.Tuesday.ordinal() + 1));
        System.out.println("Day of the week: " + Day.Wednesday);
        System.out.println("Day Number: " + (Day.Wednesday.ordinal() + 1));
        System.out.println("Day of the week: " + Day.Thursday);
        System.out.println("Day Number: " + (Day.Thursday.ordinal() + 1));
        System.out.println("Day of the week: " + Day.Friday);
        System.out.println("Day Number: " + (Day.Friday.ordinal() + 1));
        System.out.println("Day of the week: " + Day.Saturday);
        System.out.println("Day Number: " + (Day.Saturday.ordinal() + 1));
        System.out.println();
        
        //Create enumeration of months in the year
        enum Month {January, February, March, April, May, June, July, August, September, October, November, December};
        //Print them all out
        //Print out month number rather than zero based ordinal
        System.out.println("Month of the year: " + Month.January);
        System.out.println("Month Number: " + (Month.January.ordinal() + 1));
        System.out.println("Month of the year: " + Month.February);
        System.out.println("Month Number: " + (Month.February.ordinal() + 1));
        System.out.println("Month of the year: " + Month.March);
        System.out.println("Month Number: " + (Month.March.ordinal() + 1));
        System.out.println("Month of the year: " + Month.April);
        System.out.println("Month Number: " + (Month.April.ordinal() + 1));
        System.out.println("Month of the year: " + Month.May);
        System.out.println("Month Number: " + (Month.May.ordinal() + 1));
        System.out.println("Month of the year: " + Month.June);
        System.out.println("Month Number: " + (Month.June.ordinal() + 1));
        System.out.println("Month of the year: " + Month.July);
        System.out.println("Month Number: " + (Month.July.ordinal() + 1));
        System.out.println("Month of the year: " + Month.August);
        System.out.println("Month Number: " + (Month.August.ordinal() + 1));
        System.out.println("Month of the year: " + Month.September);
        System.out.println("Month Number: " + (Month.September.ordinal() + 1));
        System.out.println("Month of the year: " + Month.October);
        System.out.println("Month Number: " + (Month.October.ordinal() + 1));
        System.out.println("Month of the year: " + Month.November);
        System.out.println("Month Number: " + (Month.November.ordinal() + 1));
        System.out.println("Month of the year: " + Month.December);
        System.out.println("Month Number: " + (Month.December.ordinal() + 1));
        System.out.println();
        
        
        //Ask for CCHS username
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your CCHS username? (include graduation year)");
        //Create string of username as well as string of the year part
        String strUser = scan.next();
        String num = strUser.substring(strUser.length() - 4, strUser.length());
        Integer year = Integer.parseInt(num);
        //Print graduation year and year after graduation
        System.out.println("Graduation year: " + year);
        System.out.println("Year after graduation: " + (year + 1));
        //Print binary string version of graduation year
        String binary = Integer.toBinaryString(year);
        System.out.println("In computer language, you graduate in: " + binary);
        
        
        
        
        
    }
}
