package test;

public class Goods {
	
	public static void main(String[] args) {
		Goods2 camera = new Goods2();

		camera.SetscName(camera.sc.next());
		camera.SetscPrice(camera.sc.nextInt());
		camera.SetscNumberOfStock(camera.sc.nextInt());
		camera.SetscSold(camera.sc.nextInt());

		System.out.println("상품 이름:" + camera.name);
		System.out.println("상품 가격:" + camera.price);
		System.out.println("재고 수량:" + camera.numberOfStock);
		System.out.println("팔린 수량:" + camera.sold);
	}
}