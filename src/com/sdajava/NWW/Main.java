package com.sdajava.NWW;

    public class Main {

        public static int nww(int a, int b){
            int c = a; int d = b;
            while (a != b){            // nwd
                if (a > b){
                    a = a - b;
                }
                else {
                    b = b - a;
                }
            }
            return c / a * d;             // wzor na nww

        }

        public static void main(String[] args) {
            System.out.println(Main.nww(5,12));
        }
    }


