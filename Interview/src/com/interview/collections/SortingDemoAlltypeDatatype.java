package com.interview.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//Asceding order

public class SortingDemoAlltypeDatatype{

    public static <T> void printInfo(List<T> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        // Sorting Integer List
        List<Integer> intList = Arrays.asList(12, 10, 30, 45, 0, 8, 65, 1);
        System.out.println("<<<<<<<<<<<<<< For Integer >>>>>>>>>>>>");
        System.out.println("Before Sorting:");
        printInfo(intList);
        Collections.sort(intList);
        System.out.println("After Sorting:");
        printInfo(intList);

        // Sorting String List
        List<String> strList = Arrays.asList("zaid", "zffuer", "aakash", "prajakta");
        System.out.println("\n<<<<<<<<<<<<<< For String >>>>>>>>>>>>");
        System.out.println("Before Sorting:");
        printInfo(strList);
        Collections.sort(strList);
        System.out.println("After Sorting:");
        printInfo(strList);

        // Sorting Employee List
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Indra", 2, "Mumbai"));
        empList.add(new Employee("Abhi", 1, "Pune"));
        empList.add(new Employee("Praju", 4, "Bangalore"));
        empList.add(new Employee("Vinayak", 5, "Baramati"));

        System.out.println("\n<<<<<<<<<<<<<< For Employee >>>>>>>>>>>>");
        System.out.println("Before Sorting:");
        printInfo(empList);
        Collections.sort(empList);
        System.out.println("After Sorting:");
        printInfo(empList);
    }
}