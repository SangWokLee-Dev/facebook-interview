package com.facebook.date;

import org.joda.time.Days;
import org.joda.time.LocalDate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateFormatExample {
  private static final DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
  private static final DateFormat format = new SimpleDateFormat("dd/MM/yyyy");

  public static void main(String args[]) throws ParseException {
    String string = "February 6, 2014";
    Date date;
    date = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH).parse(string);
    System.out.println(date);
    //    System.out.println("Please enter two dates in format yyyy/MM/dd to compare");
    //    Scanner reader = new Scanner(System.in);
    //
    //    String first = reader.nextLine();
    //    String second = reader.nextLine();
    //
    //    Date one = getDate(first);
    //    Date two = getDate(second);
    //
    //    long numberOfDays = daysBetween(one, two);
    //    System.out.printf("Number of days between %s and %s is : %d %n", first, second,
    // numberOfDays);
    //    int differenceBetweenDates = daysBetweenUsingJoda(one, two);
    //    System.out.printf(
    //        "difference between two dates %s and %s is: %d %n", first, second,
    // differenceBetweenDates);
    //    reader.close();
  }

  public static synchronized Date toDate(String date) throws ParseException {
    return format.parse(date);
  }

  private static Date getDate(String date) throws ParseException {
    return df.parse(date);
  }

  private static long daysBetween(Date one, Date two) {
    long difference = (one.getTime() - two.getTime()) / 86400000;
    return Math.abs(difference);
  }

  public static int daysBetweenUsingJoda(Date d1, Date d2) {
    return Days.daysBetween(new LocalDate(d1.getTime()), new LocalDate(d2.getTime())).getDays();
  }
}
