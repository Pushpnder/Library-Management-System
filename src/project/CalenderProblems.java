/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author pushp
 */
public class CalenderProblems {
    public static int findDays(String str){
        //get today's date
        LocalDate now = LocalDate.now();
        // brake given string to dd/mm/yy
        int day=Integer.parseInt( str.substring(0, 2));
        int month=Integer.parseInt( str.substring(3, 5));
        int year=Integer.parseInt( str.substring(6));
        //old date
        LocalDate past =LocalDate.of(year,month, day);
        return Period.between(past, now).getDays();
    }
}
