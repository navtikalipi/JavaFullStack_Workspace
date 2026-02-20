package com.example.localization;

import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.PropertyResourceBundle;

public class LanguageExample {

    ResourceBundle bundle = ResourceBundle.getBundle("message", Locale.CHINA);

    public void show(Locale loc) {
        try {
            bundle = new PropertyResourceBundle(
                    new InputStreamReader(
                            getClass().getClassLoader()
                                    .getResourceAsStream("message_" + loc.toString() + ".properties"),
                            StandardCharsets.UTF_8
                    )
            );

            System.out.println("Date: " + LocalDate.now());
            System.out.println(bundle.getString("hello"));
            System.out.println(bundle.getString("welcome"));
            System.out.println(bundle.getString("message1"));
            System.out.println(bundle.getString("message2"));
            System.out.println(bundle.getString("regards"));
            System.out.println("***************************");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {

        LanguageExample t = new LanguageExample();

        Locale inLocale = new Locale("hi", "IN");
        Locale usLocale = new Locale("en", "US");
        Locale zhLocale = new Locale("zh", "CN");
        Locale frLocale = Locale.FRANCE;
        Locale jpLocale = Locale.JAPAN;
        Locale arLocale = new Locale("ar", "SA");
        Locale heLocale = new Locale("he", "IL");
        Locale deLocale = Locale.GERMANY;
        Locale esLocale = new Locale("es", "ES");

        System.out.println("Select your language ");
        System.out.println("1: English");
        System.out.println("2: French");
        System.out.println("3: Chinese");
        System.out.println("4: Hindi");
        System.out.println("5: Japanese");
        System.out.println("6: Arabic");
        System.out.println("7: Hebrew");
        System.out.println("8: German");
        System.out.println("9: Spanish");
        System.out.println("10: Exit");

        Scanner scn = new Scanner(System.in);
        int choice = scn.nextInt();

        switch (choice) {
            case 1: t.show(usLocale); break;
            case 2: t.show(frLocale); break;
            case 3: t.show(zhLocale); break;
            case 4: t.show(inLocale); break;
            case 5: t.show(jpLocale); break;
            case 6: t.show(arLocale); break;
            case 7: t.show(heLocale); break;
            case 8: t.show(deLocale); break;
            case 9: t.show(esLocale); break;
            default: System.out.println("Thank you!");
        }
    }
}
