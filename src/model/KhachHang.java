package model;

public class KhachHang {

	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public KhachHang(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public KhachHang() {
		super();
	}

	public int MuaHang(HangHoa hh) {
		return hh.tinhTien();
	}

	public boolean kiemTra(String username, String password) {
		return this.username.compareToIgnoreCase(username) == 0 && 
				this.password.compareTo(password) == 0;
	}
}
