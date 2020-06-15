package com.mdoc.snakeandladder.businessprocess;

public class LadderObject extends GameObject{

	@Override
	public int calculateFinalPostion(int currentPosition) {
		
    int finalPostion =currentPosition;

     if(currentPosition ==12) {
    	 finalPostion =26;
     }
     if(currentPosition ==24) {
    	 finalPostion =33;
     }
     if(currentPosition ==35) {
    	 finalPostion =36;
     }
     if(currentPosition ==5) {
    	 finalPostion =10;
     }
     if(currentPosition ==40) {
    	 finalPostion =45;
     }
    
    
	return finalPostion;

	}
	@Override
	public int calculateFinalCredit(int currentCredit) {
		
		return  currentCredit+=100;
	}

}
