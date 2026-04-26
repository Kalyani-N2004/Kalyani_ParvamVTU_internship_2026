package com.prctice_questions1;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();

        boolean prime=true;

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                prime=false;
                break;
            }
        }

        if(prime){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime");
        }
    }
}