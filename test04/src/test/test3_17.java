package test;

import java.util.Scanner;

public class test3_17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String me;
		boolean a = true,b = false;
		while(true) {
			int num,min=0,max=99,counter=1;
			int random = (int)(Math.random()*99+1);
			System.out.print("���ڰ� ���������ϴ�. ���߾� ������!>>");
			while(a) {
				num = sc.nextInt();
				if(num>random) {
					max = num;
					System.out.println(min+"-"+max);
					System.out.print(counter+">>");
					counter++;
				}else if(num<random){
					min = num;
					System.out.println(min+"-"+max);
					System.out.print(counter+">>");
					counter++;
				}else if(num==random) {
					System.out.println("�¾ҽ��ϴ�.");
					a = false;
					b = true;
					break;
				}
			}
				System.out.print("�ٽ� �ϰڽ��ϱ�?(y/n)");
				me = sc.next();
				while(b) {
					if(me.equals("y")) {
						a = true;
						b = false;
					}else if(me.equals("n")){
						break;
					}else {
						System.out.println("����� �Է����ּ���!");
						System.out.print("�ٽ� �ϰڽ��ϱ�?(y/n)");
						me = sc.next();
						continue;
					}
				}
				if(me.equals("n")) {
					System.out.println("������ �����ϰڽ��ϴ�.");
					break;
				}
			
		}
	}

}


