package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReferenceBook extends ManageBook {
	private int ma_so;
	private String ten_sach;
	private int so_luong;
	private String nha_xuat_ban;
	private String tac_gia;
	private int don_gia;
	private float thue;
	
	public ReferenceBook(int ma_so,String ten_sach,int so_luong,String nha_xuat_ban,String tac_gia,int don_gia,float thue) {
		this.ma_so = ma_so;
		this.ten_sach = ten_sach;
		this.so_luong = so_luong;
		this.nha_xuat_ban = nha_xuat_ban;
		this.tac_gia = tac_gia;
		this.don_gia = don_gia;
		this.thue = thue;
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
	public String getNha_xuat_ban() {
		return nha_xuat_ban;
	}
	public void setNha_xuat_ban(String nha_xuat_ban) {
		this.nha_xuat_ban = nha_xuat_ban;
	}
	public String getTac_gia() {
		return tac_gia;
	}
	public void setTac_gia(String tac_gia) {
		this.tac_gia = tac_gia;
	}
	public int getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(int don_gia) {
		this.don_gia = don_gia;
	}
	public float getThue() {
		return thue;
	}
	public void setThue(float thue) {
		this.thue = thue;
	}
	@Override
	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sach tham khao:");
		int n = input.nextInt();
		ArrayList<ReferenceBook> danhsach = new ArrayList<ReferenceBook>();
		for(int i=1;i<=n;i++) {
			input.nextLine();
			System.out.println("Nhap thong tin sach thu "+i);
			ReferenceBook x = new ReferenceBook(ma_so,ten_sach,so_luong,nha_xuat_ban,tac_gia,don_gia,thue);
			System.out.println("Nhap ma so cua sach tham khao:");
			x.ma_so = input.nextInt();
			System.out.println("Nhap ten sach:");
			x.ten_sach = input.nextLine();
			System.out.println("Nhap so luong cua sach:");
			x.so_luong = input.nextInt();
			System.out.println("Nhap nha xuat ban:");
			x.nha_xuat_ban = input.nextLine();
			System.out.println("Nhap tac gia cua sach:");
			x.tac_gia = input.nextLine();
			System.out.println("Nhap don gia cua sach:");
			x.don_gia = input.nextInt();
			System.out.println("Nhap thue phai tra cho tung quyen sach:");
			x.thue = input.nextFloat();
			danhsach.add(x);	
		}
		Collections.sort(danhsach, new Comparator<ReferenceBook>() {
			@Override
			public int compare(ReferenceBook rb1, ReferenceBook rb2) {
				if(rb1.don_gia < rb2.don_gia) {
					return 1;
				}else if(rb1.don_gia == rb2.don_gia) {
					return 0;
				}else {
					return -1;
				}
			}
		});
		System.out.println("Danh sach sap xep theo thu tu don gia giam dan cua sach tham khao la: ");
        for (int i = 0; i < danhsach.size(); i++) {
            System.out.println("Ma: " + danhsach.get(i).ma_so + " don gia: " + danhsach.get(i).don_gia);
        }
        
        String tenSach;
        int countSach = 0;
        System.out.println("Nhap ten sach can tim:");
        tenSach = input.nextLine();
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).getTen_sach().equals(tenSach)) {
            	danhsach.get(i).display();
                countSach++;
            }
        }

        if (countSach == 0) {
            System.out.println("Khong co sach nao co ten nhu yeu cau:");
        }
	}

	

}
