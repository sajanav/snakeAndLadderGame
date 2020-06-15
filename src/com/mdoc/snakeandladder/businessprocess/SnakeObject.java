package com.mdoc.snakeandladder.businessprocess;

public class SnakeObject  extends GameObject {

	@Override
	public int calculateFinalPostion(int currentPosition) { 
	
		int finalPostion =currentPosition;
	if(currentPosition ==14) {
    	 finalPostion =2;
     }
     if(currentPosition ==43) {
    	 finalPostion =41;
     }
     if(currentPosition ==47) {
    	 finalPostion =37;
     }
     if(currentPosition ==23) {
    	 finalPostion =8;
     }
   
	return finalPostion;
     	
	}

	@Override
	public int calculateFinalCredit(int currentCredit) {
		
			return  currentCredit-=100;
	}

}
