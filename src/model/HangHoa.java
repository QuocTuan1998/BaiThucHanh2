package model;

public class 	HangHoa {

	private String tenHang;
	private String ngaySX;
	private int donGia;
	private int soLuong;

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getNgaySX() {
		return ngaySX;
	}

	public void setNgaySX(String ngaySX) {
		this.ngaySX = ngaySX;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int tinhTien() {
		int tien = 0;
		tien += this.soLuong * this.donGia;
		return tien;

	}

	public HangHoa(String tenHang, String ngaySX, int donGia) {
		super();
		this.tenHang = tenHang;
		this.ngaySX = ngaySX;
		this.donGia = donGia;

	}

	public HangHoa() {
		super();
	}

	@Override
	public String toString() {

		return this.tenHang + "------" + this.donGia + "VNĐ";
	}

}
