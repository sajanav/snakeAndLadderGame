package com.mdoc.snakeandladder.test;

import java.util.Scanner;

import com.mdoc.snakeandladder.businessprocess.GameObject;
import com.mdoc.snakeandladder.businessprocess.LadderObject;
import com.mdoc.snakeandladder.businessprocess.SnakeObject;
import com.mdoc.snakeandladder.dto.ResultDTO;
import com.mdoc.snakeandladder.validations.ValidateGame;


public class SnakeAndLadderGameTest {
	
	public static void main(String[] args) {		
	
		
		
		int currentCredit= 500;
		int currentPosition=1;
		ResultDTO dto = new ResultDTO(1, 500) ;
		ValidateGame  validation = new ValidateGame();
		while(validation.validateResult(dto)) {
			 currentPosition=processInput(dto);
			 currentCredit =dto.getFinalScore();
			 dto.setFinalPosition(currentPosition);
			  if( dto.getFinalPosition()!=1) {
					GameObject object= getInstanceOfGame(currentPosition);
					dto = prepareResultForGame(object,currentPosition,currentCredit);
					if(validation.validateResult(dto)) {
					System.out.print("You are at Position  "+dto.getFinalPosition()+"  with Euro  "+dto.getFinalScore()+":Please enter the die roll as an integer: ");
					continue;
					}
				}			
		}
	
	}


 private static ResultDTO prepareResultForGame(GameObject object, int currentPosition,int currentCredit) {
		ResultDTO resultDTO= new ResultDTO();
		if(object!=null) {
			resultDTO.setFinalPosition(object.calculateFinalPostion(currentPosition));
			resultDTO.setFinalScore(object.calculateFinalCredit(currentCredit));
	 }else {
		 resultDTO.setFinalPosition(currentPosition);
		 resultDTO.setFinalScore(currentCredit);
	 }
		return resultDTO;
	}




	private static GameObject getInstanceOfGame(int currentPosition) {
		
		GameObject object= null ;
		
		if(currentPosition == 14 ||currentPosition == 43 ||currentPosition==47||currentPosition==23)
		{
			object = new SnakeObject();
		}
		else if(currentPosition == 5 ||currentPosition == 12 ||currentPosition==16||currentPosition==40||currentPosition==24||currentPosition==35)
		{
			object = new LadderObject();
		}
		return object;
		
	}
	private static int processInput(ResultDTO dto) {
		Scanner sc = new Scanner(System.in);
		if(dto.getFinalPosition()==1) {
		System.out.println("You are at Position 1 with Euro 500:Please enter the die roll as an integer:");
		}
	    int dierollNumber =sc.nextInt();
		if(valdiateInput(dierollNumber)){
			return dto.getFinalPosition()+dierollNumber;
		}
		return dto.getFinalPosition();
	}
		private static boolean valdiateInput(int dierollNumber) {
			if(dierollNumber <=0 ||dierollNumber >6 ) {
				System.out.println("Please enter an integer greater than 0 and less than 6");
				return false;
			}
			return true;		
		}

}
