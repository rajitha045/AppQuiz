package com.example.sony.appquiz;
//class used to check a number is prime or not
public class PrimeCheck {




    public Boolean checkPrime(int n){
        boolean flag=false;
        int i,m;
        m=n/2;
        for(i=2;i<=m;i++){
            if(n%i==0){
                flag=true;
                break;
            }
        }
        return !flag;





    }
}
