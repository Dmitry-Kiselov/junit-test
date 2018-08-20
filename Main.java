package lv.ctco.javaschool;
//
//import java.util.*;
//import java.io.Console;
//import java.util.Arrays;
//import java.util.Scanner;

class Main {
    public static void main(String[] args) {


        public class Perms { //permissions - перестановки
            private int[][] perms; //массив перестановок
            private int[] p; //следующая перестановка
            private int n;
            private int k;
            public Perms(int[1,2,3] ) { //конструктор
//                n = s.length;
                perms = new int[fact(n)][n];
                p = Arrays.copyOf(s, n);
                k = 0;
                antilex(n-1);
            }
            public int[][] getPerms() {
                return perms;
            }
            public void antilex(int m) { //заполняем массив перестановками
                if(m == 0)
//                    perms[k++] = Arrays.copyOf(p, n);
                else {
                    for(int i = 0; i <= m; i++) {
                        antilex(m-1);
                        if(i < m) {
                            swap(i, m);
                            reverse(m-1);
                        }
                    }
                }
            }
            public void swap(int a, int b) { //меняет местами требования
                int t = p[a];
                p[a] = p[b];
                p[b] = t;
            }
            public void reverse(int m) { //реверс вектора
                int i = 0;
                int j = m;
                while(i < j) {
                    swap(i, j);
                    i++;
                    j--;
                }
            }
            public static int fact(int n) {//подсчет факториала
                int res = 1;
                for(int i = 1; i <= n; i++)
                    res *= i;
                return res;
            }

//           System.out.println();
        }


        System.out.println("Hello World!");
    }
    }
}