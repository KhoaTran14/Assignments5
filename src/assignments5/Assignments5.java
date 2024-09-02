
package assignments5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assignments5 {

    public static ArrayList<Integer> Nhap(ArrayList<Integer> num) {
        Scanner sc = new Scanner(System.in);
        System.out.println("So luong phan tu cua mang la: ");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            System.out.print("Num[" + i + "] = ");
            int value = sc.nextInt();
            num.add(value);
        }
        return num;
    }

    public static void Xuat(ArrayList<Integer> num) {
        System.out.println("Number[]= " + Arrays.toString(num.toArray()));
    }

    public static int findMax2(ArrayList<Integer> num) {
        int n = num.size();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num.get(i) < num.get(j)) {
                    int temp = num.get(i);
                    num.set(i, num.get(j));
                    num.set(j, temp);
                }
            }
        }
        return num.get(1);
    }

    public static void Xoa(ArrayList<Integer> num) {
        ArrayList<Integer> sochan = new ArrayList<>();
        for (int value : num) {
            if (value % 2 == 0) {
                sochan.add(value);
            }
        }
        num.clear();
        num.addAll(sochan);
    }

}

