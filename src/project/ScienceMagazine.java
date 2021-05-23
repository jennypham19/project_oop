package project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import project.ScienceMagazine;

public class ScienceMagazine extends ManageBook {
	private int ma_so;
	private String nha_xuat_ban;
	private int don_gia;
	
	public ScienceMagazine(int ma_so,String nha_xuat_ban,int don_gia) {
		this.ma_so = ma_so;
		this.nha_xuat_ban = nha_xuat_ban;
		this.don_gia = don_gia;
	}
	
	public int getMa_so() {
		return ma_so;
	}

	public void setMa_so(int ma_so) {
		this.ma_so = ma_so;
	}

	public String getNha_xuat_ban() {
		return nha_xuat_ban;
	}

	public void setNha_xuat_ban(String nha_xuat_ban) {
		this.nha_xuat_ban = nha_xuat_ban;
	}

	public int getDon_gia() {
		return don_gia;
	}

	public void setDon_gia(int don_gia) {
		this.don_gia = don_gia;
	}

	public void display() {
		Scanner input = new Scanner(System.in);
		System.out.println("Nhap so sach khoa hoc: ");
		int n = input.nextInt();
		ArrayList <ScienceMagazine> danhSach = new ArrayList<ScienceMagazine>();
		for(int i = 1; i< n;i++) {
			input.nextLine();
			ScienceMagazine x = new ScienceMagazine(ma_so,nha_xuat_ban,don_gia);
			System.out.println("Thong tin sach thu "+ i);
			System.out.println("Ma so cua sach khoa hoc: ");
			x.ma_so = input.nextInt();
			System.out.println("Nha xuat ban sach : ");
			x.nha_xuat_ban = input.nextLine();
			System.out.println("Don gia cua sach:");
			x.don_gia = input.nextInt();
			danhSach.add(x);
	}
		Collections.sort(danhSach, new Comparator<ScienceMagazine>() {
            @Override
            public int compare(ScienceMagazine sm1, ScienceMagazine sm2) {
                if (sm1.don_gia < sm2.don_gia) {
                    return 1;
                } else {
                    if (sm1.don_gia == sm2.don_gia) {
                        return 0;
                    } else {
                        return -1;
                    }
                }
            }
        });
		System.out.println("Danh sach sap xep theo thu tu don gia giam dan cua sach khoa hoc la: ");
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println("Ma: " + danhSach.get(i).ma_so + " don gia: " + danhSach.get(i).don_gia);
        }
	}
}
