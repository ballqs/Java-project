package test;

public class Goods {
	
	public static void main(String[] args) {
		Goods2 camera = new Goods2();

		camera.SetscName(camera.sc.next());
		camera.SetscPrice(camera.sc.nextInt());
		camera.SetscNumberOfStock(camera.sc.nextInt());
		camera.SetscSold(camera.sc.nextInt());

		System.out.println("��ǰ �̸�:" + camera.name);
		System.out.println("��ǰ ����:" + camera.price);
		System.out.println("��� ����:" + camera.numberOfStock);
		System.out.println("�ȸ� ����:" + camera.sold);
	}
}