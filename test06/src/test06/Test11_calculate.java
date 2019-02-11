package test06;

public class Test11_calculate {
	private int num1,num2,sum;
	public void setValue(int a, int b) {
		this.num1 = a;
		this.num2 = b;
	}
	public void Add() {
		this.sum = num1 + num2;
	}
	public void Sub() {
		this.sum = num1 - num2;
	}
	public void Mul() {
		this.sum = num1 * num2;
	}
	public void Div() {
		this.sum = num1 / num2;
	}
	public int calculate() {
		return sum;
	}
}
