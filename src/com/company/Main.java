package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        List<Hamster> ham = new ArrayList<>();

        ham.add(new Hamster(5,0));
        ham.add(new Hamster(2,2));
        ham.add(new Hamster(1,4));
        ham.add(new Hamster(5,1));

        List<Hamster> ham1 = new ArrayList<>();
        ham1.add(new Hamster(1,2));
        ham1.add(new Hamster(2,2));
        ham1.add(new Hamster(3,1));

        List<Hamster> ham2 = new ArrayList<>();
        ham1.add(new Hamster(1,50000));
        ham1.add(new Hamster(1,60000));

        BinarySearch binarySearch = new BinarySearch();
        System.out.println("task1 - " + binarySearch.binarySearch(ham1,7));
        System.out.println("task2 - " + binarySearch.binarySearch(ham,19));
        System.out.println("task3 - " + binarySearch.binarySearch(ham,2));

        Reader reader = new Reader();
        ArrayList<String> list= reader.reader("B:\\gitAlgorithms\\AlgoLab2\\src\\com\\company\\test.txt");

        int key = Integer.parseInt(list.get(0));
        List<Hamster> hamsters = new ArrayList<>();
        for (int i = 2; i < Integer.parseInt(list.get(1))+2; i++) {
            String[] a = list.get(i).split(" ");
            hamsters.add(new Hamster(Double.parseDouble(a[0]),Double.parseDouble(a[1])));
        }

        System.out.println("task - " + binarySearch.binarySearch(hamsters, key));

    }































}
