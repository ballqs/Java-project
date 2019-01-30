package test06;

public class test01_1TV{
	private String name = "";
	private int year = 0;
	private int size = 0;
	test01_1TV(String name,int year, int size){
		this.name = name;
		this.year = year;
		this.size = size;
	}
	public void show() {
		System.out.println(name+"에서 만든 "+year+"년형 "+size+"인치 TV");
	}
}
