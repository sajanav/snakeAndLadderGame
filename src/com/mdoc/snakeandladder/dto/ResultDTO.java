package com.mdoc.snakeandladder.dto;

public class ResultDTO {
	
	private int finalPosition;
	
	public ResultDTO(int finalPosition, int finalScore) {
		super();
		this.finalPosition = finalPosition;
		this.finalScore = finalScore;
	}
	public ResultDTO() {
	
	}
	public int getFinalPosition() {
		return finalPosition;
	}
	public void setFinalPosition(int finalPosition) {
		this.finalPosition = finalPosition;
	}
	public int getFinalScore() {
		return finalScore;
	}
	public void setFinalScore(int finalScore) {
		this.finalScore = finalScore;
	}
	private int finalScore;

}
