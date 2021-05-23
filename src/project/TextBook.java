package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TextBook extends ManageBook {
	private int ma_so;
	private String ten_sach;
	private int so_luong;
	private int don_gia;
	private String nha_xuat_ban;
	private String trang_thai;
	
	public TextBook(int ma_so,String ten_sach, int so_luong,int don_gia,String nha_xuat_ban,String trang_thai) {
		this.ma_so = ma_so;
		this.ten_sach = ten_sach;
		this.so_luong = so_luong;
		this.don_gia = don_gia;
		this.nha_xuat_ban = nha_xuat_ban;
		this.trang_thai = trang_thai;
	}
	
	public int getMa_so() {
		return ma_so;
	}
	public void setMa_so(int ma_so) {
		this.ma_so = ma_so;
	}
	public String getTen_sach() {
		return ten_sach;
	}

	public void setTen_sach(String ten_sach) {
		this.ten_sach = ten_sach;
	}
	
	public int getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}
	public int getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(int don_gia) {
		this.don_gia = don_gia;
	}
	public String getNha_xuat_ban() {
		return nha_xuat_ban;
	}
	public void setNha_xuat_ban(String nha_xuat_ban) {
		this.nha_xuat_ban = nha_xuat_ban;
	}
	public String isTrang_thai() {
		return trang_thai;
	}
	public void setTrang_thai(String trang_thai) {
		this.trang_thai = trang_thai;
	}
	@Override
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sach giao khoa:");
		int n = input.nextInt();
		ArrayList<TextBook> danhsach = new ArrayList<TextBook>();
		for(int i=1; i<=n;i++) {
			input.nextLine();
			TextBook x = new TextBook(ma_so,ten_sach,so_luong,don_gia,nha_xuat_ban,trang_thai);
			System.out.println("Nhap thong tin sach thu "+i);
			System.out.println("Nhap ma so cua sach giao khoa:");
			x.ma_so = input.nextInt();
			System.out.println("Nhap ten sach:");
			x.ten_sach = input.nextLine();
			System.out.println("Nhap so luong sach:");
			x.so_luong = input.nextInt();
			System.out.println("Nhap don gia cua sach:");
			x.don_gia = input.nextInt();
			System.out.println("Nhap nha xuat ban:");
			x.nha_xuat_ban = input.nextLine();
			System.out.println("Nhap tinh trang cua sach:");
			x.trang_thai = input.nextLine();
			danhsach.add(x);
		}
		Collections.sort(danhsach, new Comparator<TextBook>() {
			@Override
			public int compare(TextBook tb1, TextBook tb2) {
				if(tb1.don_gia < tb2.don_gia) {
					return 1;
				}else if(tb1.don_gia == tb2.don_gia) {
					return 0;
				}else {
					return -1;
				}
			}
		});
		System.out.println("Danh sach sap xep theo thu tu don gia giam dan cua sach giao khoa la: ");
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println("Ma: " + danhsach.get(i).ma_so + " don gia: " + danhsach.get(i).don_gia);
        }
        
        String tenSach;
        int count = 0;
        System.out.println("Nhap ten sach can tim:");
        tenSach = input.nextLine();
        for(int i = 0; i < danhsach.size(); i++) {
        	if(danhsach.get(i).getTen_sach().equals(tenSach)) {
        		danhsach.get(i).display();
        		count ++;
        	}
        	
        	if(count == 0) {
        		System.out.println("Khong co ten sach ma ban can tim!!!");
        	}
        }
		
	}

	
}
