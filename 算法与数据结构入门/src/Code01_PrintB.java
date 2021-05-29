public class Code01_PrintB {
    public static void print(int num){
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1<<i)) == 0 ? "0" : "1");
        }
    }

    public static void main(String[] args) {
        int num = 9;
        int num1 = 3;
        int a=Integer.MIN_VALUE;
        print(num);
        System.out.println();
        print(num1);
        System.out.println();

        print(num | num1);
        System.out.println();
        print(num ^ num1);

        System.out.println();
        print(a);
        System.out.println();
        print(a>>1);
        System.out.println();



    }
}
