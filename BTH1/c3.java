package BTH1;

import java.util.Scanner;

public class c3 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int a,b;int kq=0;
	System.out.println("Nhap a : ");
	a=sc.nextInt();
	System.out.println("Nhap b : ");
	b=sc.nextInt();kq=a-b;
	System.out.println("Tong a va b :"+(a+b));
	if(a<b) {
		System.out.println("Hieu b va a: "+(b-a));
	}else {
	System.out.println("Hieu a va b :"+(a-b));
}
}
}