import java.util.Scanner;

public class Main {
    public static class Test {  // Thêm static để có thể truy cập trong main
        public int a;
        public int b;
        
        public Test(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a  = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Hello World");
        int c = a + b;  // Lỗi vì a không phải kiểu int 
        System.out.println(c);
        sc.close();
    }
}