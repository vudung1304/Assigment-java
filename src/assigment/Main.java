package assigment;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createMenu();
    }

    public static void createMenu() {
        Scanner sc = new Scanner(System.in);
        PostController postController = new PostController();
        while (true) {
            System.out.println("Menu chuong trinh: ");
            System.out.println("--------------------------------------");
            System.out.println("1.Them bai viet moi.");
            System.out.println("2.Danh sach bai viet moi.");
            System.out.println("3.Tim kiem bai viet theo ma ArrayList.");
            System.out.println("4.Xoa bai viet theo ma ArrayList.");
            System.out.println("0.Thoat chuong trinnh");
            System.out.println("--------------------------------------");
            System.out.println("Nhap lua chon cua ban:");
            int choice = .nextInt();
            switch (choice) {

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
