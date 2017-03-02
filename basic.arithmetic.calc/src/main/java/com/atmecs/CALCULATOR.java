package com.atmecs;


public class CALCULATOR 
{
    public static void main( String[] args )
    {
    	CALCULATOR calc= new CALCULATOR();
        System.out.println("Addition Result: "+calc.add(20, 15, 23,45,67));
        System.out.println("Substraction Result: "+calc.substract(20, 15, 23,45,67));
    }
    
    int add(int numberOne, int numberTwo ,int... moreNumbers ){
    	
    	int sum = numberOne+numberTwo;
    	
    	if(moreNumbers.length!=0){
    		for(int index=0;index<moreNumbers.length;++index){
    			sum +=moreNumbers[index];
    		}
    	}
    	return sum;
    }
    
    int substract(int numberOne, int numberTwo ,int... moreNumbers ){
    	
    	int diff = numberOne-numberTwo;
    	
    	if(moreNumbers.length!=0){
    		for(int index=0;index<moreNumbers.length;++index){
    			diff -=moreNumbers[index];
    		}
    	}
    	return diff;
    }
}
