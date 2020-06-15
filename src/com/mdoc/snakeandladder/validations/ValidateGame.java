package com.mdoc.snakeandladder.validations;

import com.mdoc.snakeandladder.dto.ResultDTO;

public class ValidateGame {
	
	public  boolean validateResult(ResultDTO dto) {

		
	     if(dto.getFinalPosition()==49) {
	    	 System.out.println("You won the game !!!");
	    	 return false;
	     }
	     
	   	    
	     if(dto.getFinalScore()<=0) {
	    	 System.out.println("You lost the game !!!");
	    	 return false;
	     }
	     
	          
		  return true;
			
		}

	public  boolean valdiateInput(int dierollNumber) {
		if(dierollNumber <=0 ||dierollNumber >6 ) {
			return false;
		}
		return true;		
	}
}
