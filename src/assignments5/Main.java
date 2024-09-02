package assignments5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String check;
        do {
            System.out.println("Menu: Nhap data (phim 1), xuat data (phim 2), FindMax2(Phim 3), DeleteOddNumber(phim 4)");
            int choosion = Integer.parseInt(sc.nextLine());
            switch (choosion) {
                case 1:
                    num = Assignments5.Nhap(num);
                    break;
                case 2:
                    Assignments5.Xuat(num);
                    break;
                case 3:
                    int max2 = Assignments5.findMax2(num);
                    System.out.println("Phan tu lon thu hai trong mang la: " + max2);
                    break;
                case 4:
                    Assignments5.Xoa(num);
                    System.out.println("Danh sach sau khi xoa so le: ");
                    Assignments5.Xuat(num);
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
            System.out.println("Nhan yes de tiep tuc!");
            check = sc.nextLine();
        } while (check.equals("yes"));
    }
}
