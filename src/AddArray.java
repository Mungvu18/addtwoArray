import java.util.Arrays;
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập kích thước mảng 1");
        int n1 = sc.nextInt();
        System.out.println("nhập kích thước mảng 2");
        int n2 = sc.nextInt();
        int [] arr1 = new int[n1];
        int [] arr2 = new int[n2];
        int [] arr3 = new int[(n1+n2)];
        System.out.println("Gán giá trị cho vòng lặp 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("Gán giá trị cho vòng lặp 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr2));
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        System.out.println("kết quả khi cộng mảng là");
        System.out.println(Arrays.toString(arr3));
    }
}
