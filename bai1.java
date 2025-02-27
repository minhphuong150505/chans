import java.util.Scanner;
public class bai1 {
    public static void main(String[] args){  // 
        Scanner sc = new Scanner(System.in);
        System.err.printf("Nhap ten sinh vien: ") ;
        String name = sc.nextLine();
        System.out.printf("Nhap diem trung binh: ");
        float diem = sc.nextFloat();
        System.out.println("Ten sinh vien: " + name);
        System.out.println("Diem trung binh: " + diem);
        sc.close();
    }
}