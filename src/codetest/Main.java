package codetest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: xinyan
 * @data: 2022/09/19/18:10
 **/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        List list1 = new ArrayList<>();
        List list2 = new ArrayList<>();
        List list3 = new ArrayList<>();
        List list4 = new ArrayList<>();
        int max = arr[4];

        for (int i = 0; i < arr[0]; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                list1.add(temp);
            }
        }
        for (int i = 0; i < arr[1]; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                list2.add(temp);
            }
        }
        for (int i = 0; i < arr[2]; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                list3.add(temp);
            }
        }
        for (int i = 0; i < arr[3]; i++) {
            int temp = sc.nextInt();
            if (temp > max) {
                list4.add(temp);
            }
        }
        int n1 = list1.size();
        int n2 = list2.size();
        int n3 = list3.size();
        int n4 = list4.size();
        int min = Math.min(Math.min(n1,n2), Math.min(n3,n4));
        System.out.println(min);
    }
}
