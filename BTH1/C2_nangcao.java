package BTH1;
import java.util.Scanner;
public class C2_nangcao {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        System.out.print("Nhap a: ");
        a=input.nextFloat();
        System.out.print("Nhap b: ");
        b=input.nextFloat();
        double tong, hieu,tich,thuong;
        tong=a+b;
        hieu = a-b;
        tich = a*b;
        thuong = a/b;
        System.out.println("Tong : "+tong);
        System.out.println("Hieu : "+hieu);
        System.out.println("Tich : "+tich);
        System.out.println("Thuong : "+thuong);
        System.out.println("Phan du cua 4 so tren :"+(tong%hieu%tich%thuong));
        System.out.println("Phan du cua 4 so tren :"+(tong-(int)tong));
}
}