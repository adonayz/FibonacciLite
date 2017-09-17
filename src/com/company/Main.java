package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        findFibonacci(n);
    }

    public static void findFibonacci(int n){
        LinkedList<Integer> fibList = new LinkedList<>();
        fibList.add(0);
        fibList.add(1);

        for(int i = 2; i <= n; i++){
            fibList.add(fibList.get(i-2) + fibList.get(i-1));
        }

        System.out.println(fibList.get(n));
    }
}
