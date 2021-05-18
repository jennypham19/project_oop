package project;

public class TextBook extends ManageBook {
	private int ma_so;
	private int so_luong;
	private String don_gia;
	private String nha_xuat_ban;
	private boolean trang_thai;
	public int getMa_so() {
		return ma_so;
	}
	public void setMa_so(int ma_so) {
		this.ma_so = ma_so;
	}
	public int getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(int so_luong) {
		this.so_luong = so_luong;
	}
	public String getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(String don_gia) {
		this.don_gia = don_gia;
	}
	public String getNha_xuat_ban() {
		return nha_xuat_ban;
	}
	public void setNha_xuat_ban(String nha_xuat_ban) {
		this.nha_xuat_ban = nha_xuat_ban;
	}
	public boolean isTrang_thai() {
		return trang_thai;
	}
	public void setTrang_thai(boolean trang_thai) {
		this.trang_thai = trang_thai;
	}
	@Override
	public void display() {
		
		
	}
	
}
