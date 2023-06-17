/**
 * program
 */
public class program {
    public static void main(String[] args) {
        // float e = 2.7f;
        // double pi = 3.1415;
        // System.out.println(e);
        // System.out.println(pi);
        // char ch = '1';
        // System.out.println(Character.isDigit(ch));
        // ch = 'a';
        // System.out.println(Character.isDigit(ch));
        // String msg = "Hello world";
        // System.out.println(msg);


        // var a = 123;
        // System.out.println(a);
        // var d = 123.456;
        // System.out.println(d);
        // System.out.println(getType(a));
        // System.out.println(getType(d));
        // d = 1022;
        // System.out.println(d);


        // String s = "qwer";
        // char w;
        // w = s.charAt(1);
        // System.out.println(w);


        // int a = 123;
        // System.out.println(++a);


        // int a = 123;
        // a = --a-a--;
        // System.out.println(a);


        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5


        // int[] arr = new int[10];
        // System.out.println(arr.length); // 10
        // arr = new int[] { 1, 2, 3, 4, 5 };
        // System.out.println(arr.length); // 5


        // int[][] arr = new int[3][5];
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.printf("%d ", arr[i][j]);
        // }
        // System.out.println();
        // }


        //  int i = 123; double d = i;
        //  System.out.println(i); // 123
        //  System.out.println(d); // 123.0
        //  d = 3.1415; i = (int)d;
        //  System.out.println(d); // 3.1415
        //  System.out.println(i); // 3
        //  d = 3.9415; i = (int)d;
        //  System.out.println(d); // 3.9415
        //  System.out.println(i); // 3
        //  byte b = Byte.parseByte("123");
        //  System.out.println(b); // 123
        //  b = Byte.parseByte("1234");
        //  System.out.println(b); // NumberFormatException: Value out of range


        // int[] a = new int[10];
        // double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность


        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s!", name);
        // iScanner.close();


        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double a: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f", x, y, x + y);
        // iScanner.close();
       

        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("int a: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();


        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);


        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);
       

        // Виды спецификаторов
        // %d: целочисленных значений
        // %x: для вывода шестнадцатеричных чисел
        // %f: для вывода чисел с плавающей точкой
        // %e: для вывода чисел в экспоненциальной форме,
        // например, 3.1415e+01
        // %c: для вывода одиночного символа
        // %s: для вывода строковых значений
        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00


        // {
        //     int i = 123;
        //     System.out.println(i);
        // }
        // System.out.println(i); // error: cannot find symbol


        // sayHi(); // hi!
        // System.out.println(sum(1, 3)); // 4
        // System.out.println(factor(5)); // 120.0


           
//    }
//    static String getType(Object o){
//        return o.getClass().getSimpleName();
//    }
//    static void sayHi() {
//    System.out.println("hi!");
//    }
//    static int sum(int a, int b) {
//    return a+b;
//    }
//    static double factor(int n) {
//    if(n==1)return 1;
//    return n * factor(n-1);
//    }
//}
