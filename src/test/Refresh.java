package test;

import java.util.Scanner;

import model.HangHoa;
import model.KhachHang;

public class Refresh {
	// khởi tạo các biến
	static String tenHang;
	static String ngaySX;
	static HangHoa hh = new HangHoa();
	static int soLuong;
	static int donGia;
	static Scanner sc = new Scanner(System.in);
	static KhachHang kh1 = new KhachHang("tuan123", "123");
	static int tongTien;

	public static void Refresh() {
		// hàm dangNhap vào mảng
		String[] s = dangNhap();
		// kiểm tra đăng nhập
		if (kh1.kiemTra(s[0], s[1])) {
			System.out.println("Đăng nhập thành công ");
			// vòng lặp mua hàng
			while (true) {
				System.out.println("bạn có muốn mua hàng (Y/N)");
				Scanner scanner = new Scanner(System.in);
				// khởi tạo biến để kiểm tra xem có mua hay không
				String choice;
				choice = scanner.nextLine();
				// nếu người dùng nhập N hoặc n thì ngừng chương trình
				if (choice.equals("N") || choice.equals("n")) {
					System.out.println("Số tiền bạn phải trả : " + tongTien);
					System.out.println("cảm ơn bạn đã sử dụng phần mềm ");
					break;
				} else {
					fakeData();
				}
			}
		} else {
			System.out.println("Xin lỗi, tài khoản của quý khách không tồn tại trong hệ thống."
					+ " Xin liên hệ để đăng kí với chi nhánh");
			System.out.println("bạn có muốn đăng nhập lại (Y/N)");
			String a = sc.nextLine();
			// hỏi xem người dùng có muốn đăng nhập lại hay không
			if (a.equals("y") || a.equals("Y")) {
				Refresh();
			}
		}
	}

	// hàm đăng nhập
	public static String[] dangNhap() {
		// tạo mảng để lưu trữ thông tin tài khoản và mật khẩu
		String s[] = new String[2];
		// người dùng nhập tài khoản
		System.out.println("nhập tên tài khoản : ");
		String tk = sc.nextLine();
		// gán tài khoản vào mảng
		s[0] = tk;
		// người dùng nhập mật khẩu
		System.out.println("mật khẩu : ");
		String mk = sc.nextLine();
		// gán mật khẩu vào mảng
		s[1] = mk;

		return s;
	}

	// giả lập dữ liệu do người dùng nhập vào
	public static void chonHang() {
		// Nhập tên hàn cần mua
		// System.out.println("bạn mua : ");
		// tenHang = sc.nextLine();
		// nhập ngày SX
		// System.out.println("vào ngày : ");
		// ngaySX = sc.nextLine();
		// nhập giá
		// System.out.println("giá : ");
		// donGia = sc.nextInt();
		// nhập số lượng
		// System.out.println("số lượng : ");
		// soLuong = sc.nextInt();
		// gán vào đối tượng đã được khởi tạo trước đó
		// hh.setTenHang(tenHang);
		// hh.setNgaySX(ngaySX);
		// hh.setSoLuong(soLuong);
		// hh.setDonGia(donGia);
		// truyền đối tượng vào phương thức mua hàng
		// System.out.println("Số tiền bạn phải trả : " + kh1.MuaHang(hh));
	}

	// giả lập dữ liệu ảo
	public static void fakeData() {

		System.out.println("danh sách đồ uống của cửa hàng");
		// khởi tạo dữ liệu ảo
		HangHoa hh1 = new HangHoa("coca", "12/2/2016", 8000);
		HangHoa hh2 = new HangHoa("pepsi", "12/2/2016", 8000);
		HangHoa hh3 = new HangHoa("sting", "12/2/2016", 7000);
		HangHoa hh4 = new HangHoa("redbull", "12/2/2016", 10000);
		HangHoa hh5 = new HangHoa("cafe", "12/2/2016", 7000);
		HangHoa hh6 = new HangHoa("nuti", "12/2/2016", 10000);
		// in ra Menu
		System.out.println("1 " + hh1);
		System.out.println("2 " + hh2);
		System.out.println("3 " + hh3);
		System.out.println("4 " + hh4);
		System.out.println("5 " + hh5);
		System.out.println("6 " + hh6);

		// tạo giá trị để khách lựa chọn
		int chon;
		System.out.println("bạn muốn uống : ");
		chon = sc.nextInt();
		switch (chon) {
		case 1:
			// nhập sô lượng cần mua
			System.out.println("số lượng : ");
			soLuong = sc.nextInt();
			hh1.setSoLuong(soLuong);
			hh1.getDonGia();// lấy giá tiền ở hh1

			tongTien += kh1.MuaHang(hh1);

			break;
		case 2:
			// nhập sô lượng cần mua
			System.out.println("số lượng : ");
			soLuong = sc.nextInt();
			hh2.setSoLuong(soLuong);
			hh2.getDonGia();// lấy giá tiền ở hh1

			tongTien += kh1.MuaHang(hh2);

			break;
		case 3:
			// nhập sô lượng cần mua
			System.out.println("số lượng : ");
			soLuong = sc.nextInt();
			hh3.setSoLuong(soLuong);
			hh3.getDonGia();// lấy giá tiền ở hh1

			tongTien += kh1.MuaHang(hh3);

			break;
		case 4:
			// nhập sô lượng cần mua
			System.out.println("số lượng : ");
			soLuong = sc.nextInt();
			hh4.setSoLuong(soLuong);
			hh4.getDonGia();// lấy giá tiền ở hh1

			tongTien += kh1.MuaHang(hh4);

			break;
		case 5:
			// nhập sô lượng cần mua
			System.out.println("số lượng : ");
			soLuong = sc.nextInt();
			hh5.setSoLuong(soLuong);
			hh5.getDonGia();// lấy giá tiền ở hh1

			tongTien += kh1.MuaHang(hh5);

			break;
		case 6:
			// nhập sô lượng cần mua
			System.out.println("số lượng : ");
			soLuong = sc.nextInt();
			hh6.setSoLuong(soLuong);
			hh6.getDonGia();// lấy giá tiền ở hh1

			tongTien += kh1.MuaHang(hh6);

			break;

		default:
			System.out.println("xin lỗi, cửa hàng chúng tôi không có loại mà quý khách cần");
			break;
		}

		// tongTien += kh1.MuaHang(hh);

	}
}
