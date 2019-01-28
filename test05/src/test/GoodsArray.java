package test;

import java.util.Scanner;

class Goods0 {
	private String name;
	private int price;
	private int numberOfStock;
	private int sold;
	
	Goods0(String n,int p, int nStack, int s){
		name = n;
		price = p;
		numberOfStock = nStack;
		sold = s;
	}
	
	String getName() {
		return name;
	}
	int getPrice() {
		return price;
	}
	int getNumberOfStock() {
		return numberOfStock;
	}
	int getSold() {
		return sold;
	}
}

public class GoodsArray {

	public static void main(String[] args) {
		Goods0 g[] = new Goods0[3];
		Scanner s = new Scanner(System.in);
		for(int i=0; i<g.length; i++) {
			String name = s.next();
			int price = s.nextInt();
			int n = s.nextInt();
			int sold = s.nextInt();
			g[i] = new Goods0(name,price,n,sold);
		}
		
		for(int i=0; i<g.length; i++) {
			System.out.print(g[i].getName()+" ");
			System.out.print(g[i].getPrice()+" ");
			System.out.print(g[i].getNumberOfStock()+" ");
			System.out.println(g[i].getSold()+" ");
		}
	}

}
