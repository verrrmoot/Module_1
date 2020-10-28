package com.company;

public class Module_1 {

    public static void main(String[] args){
        int arr[] = {3, 4, 5};
    System.out.println("Задача №1. Ответ:  " + remainder(5, 5));
    System.out.println("Задача №2. Ответ:  " + triArea(10, 10));
    System.out.println("Задача №3. Ответ:  " + animals(5,2,8));
    System.out.println("Задача №4. Ответ:  " + profitableGamble(0.9, 3, 2));
    System.out.println("Задача №5. Ответ:  " + operation(15, 11, 11));
    System.out.println("Задача №6. Ответ:  " + ctoa('['));
    System.out.println("Задача №7. Ответ:  " + addUpTo(7));
    System.out.println("Задача №8. Ответ:  " + nextEdge(9, 2));
    System.out.println("Задача №9. Ответ:  " + sumOfCubes(arr));
    System.out.println("Задача №10. Ответ:  " + abcmath(1, 2, 3));
    }

    public static int remainder(int a, int b) {
    int c = a%b;
    return c;
    }

    public static double triArea(int a, int b) {
        double c = 0.5*a*b;
        return c;
    }

    public static double animals(int chicks, int cows, int pigs) {
        double c = chicks * 2 + cows * 4 + pigs * 4;
        return c;
    }

    public static boolean profitableGamble(double prob, int prize, int pay){
        boolean c;
        if (prob * prize > pay){
             c = true;
        }
        else {
             c = false;
        }
        return c;
    }

    public static String operation(int a, int b, double N){
        String c;
        if (a + b == N){
            c = "added";
        }
        else if (a - b == N){
            c = "subtracted";
        }
        else if (a * b == N){
            c = "multiply";
        }
        else if (a/b == N){
            c = "split";
        }
        else
            c = "none";
        return c;
    }

    public static int ctoa(char a){
        return a;
    }

    public static int addUpTo(int a){
        int sum = 0;
        for (int i = 1; i <= a; i++){
            sum = sum + i;
        }
        return sum;
    }

    public static int nextEdge(int a, int b){
        int c;
        c = a + b - 1;
        return c;
    }

    public static int sumOfCubes(int[] arr){
        int sum = 0;
        for (int i  = 0; i < arr.length ;i++){
            sum = sum + arr[i] * arr[i] * arr[i];
        }
        return sum;
    }

    public static boolean abcmath(int a, int b, int c){
       boolean res;
        for (int i = 1; i <= b; i++){
            a = a + a;
        }
        if (a % c == 0){
            res  = true;
        }
        else
            res  = false;
        return res;
    }


}
