package BTH1;

import java.util.Scanner;

public class C1_nangcao {
public static void main(String[] args) {
	System.out.println("Nhap so canh cua da giac: ");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int P=0;
    System.out.println("Nhap lan luot cac canh cua da giac:");
    for(int i=0;i<n;i++) {
         a[i] = sc.nextInt();
         P+=a[i];
    }
    System.out.println("Cac canh cua da giac ban nhap ");
    for(int i=0;i<n;i++) System.out.print("  "+a[i]);
    System.out.println("\nChu vi cua da giac: "+P);	
}
}
