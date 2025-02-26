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
        System.out.println("Hello World");
        Test a = new Test(1, 2);  // Đúng cú pháp
        int c = a.a + a.b;
        System.out.println(c);
    }
}