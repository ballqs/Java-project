package test06;

public class test02_1Grade{
	private int math = 0;
	private int science = 0;
	private int english = 0;
	test02_1Grade(int math, int science, int english){
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public int average(){
		int avg = (math+science+english)/3;
		return avg;
	}
}