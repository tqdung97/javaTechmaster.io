import java.util.ArrayList;
import java.util.Scanner;

public class ListSanPham {
    // tạo ra biến có kiểu dữ liệu là ArrayList
    ArrayList<SanPham> listSanPham;

    // tạo contructor rỗng để khai trong tình huống ngta ko truyền vào ArrayList.
    public ListSanPham() {
        this.listSanPham = new ArrayList<SanPham>();// thêm class SanPham muốn sử dụng vào sanpham
    }

    public ListSanPham(ArrayList<SanPham> listSanPham) {
        this.listSanPham = listSanPham;
    }

    Scanner sc = new Scanner(System.in);

    // 1. Them moi san pham
    public void themSanPhamMoi(SanPham sp) {
        this.listSanPham.add(sp);
    }

    // 2. Xem danh sách sản phẩm
    public void xemDanhSachSanPham() {
        System.out.println(this.listSanPham.toString());
    }

    // 3. Tìm sản phẩm theo tên
    public void timSanPhamTheoTen() {
        System.out.println("Nhap ten San Pham can tim: ");
        String name = sc.nextLine();
        for (SanPham sanpham : listSanPham) {
            if (sanpham.getName().indexOf(name) >= 0) {
                System.out.println(sanpham);
            }
        }
    }

    // 4. Tìm sản phẩm theo id:
    public void timSanPhamTheoId() {
        System.out.println("Nhap ID san pham (vd: SP1,SP2,SP3,SP...: ");
        String id = sc.nextLine();
        for (SanPham idSanPham : listSanPham) {
            if (idSanPham.getId().indexOf(id) >= 0) {
                System.out.println(idSanPham);
            }
        }
    }

    // 5. Xóa sản phẩm theo Id
    public void xoaSanPhamTheoId() {
        System.out.println("Nhap ID san pham can xoa (vd: SP1,SP2,SP3,SP...: ");
        String id2 = sc.nextLine();
        for (SanPham DeleteSp : listSanPham) {
            if (DeleteSp.getId().indexOf(id2) >= 0) {
                listSanPham.remove(DeleteSp);
                System.out.println(listSanPham.toString());
            }
        }
    }

    // 6. Cập nhật số lượng sản phẩm
    public void capNhapSoLuongSp() {
        System.out.println("Nhap ID san pham can kiem tra (vd: SP1,SP2,SP3,SP...: ");
        String id3 = sc.nextLine();
        for (SanPham IdKiemTra : listSanPham) {
            if (IdKiemTra.getId().indexOf(id3) >= 0) {
                System.out.println("So luong con : " + IdKiemTra.getSoLuong() + " " + IdKiemTra.getDonViTinh());
            }
        }
    }

    // 7. Tìm các sản phẩn có số lượng dưới 5
    public void spCoSoLuongDuoi5() {
        System.out.println("San pham co so Luong duoi 5 la:");
        for (SanPham num : listSanPham) {
            if (num.getSoLuong() < 5) {
                System.out.println(num.toString());
            }
        }
    }

    double num = 50000;
    double num2 = 100000;

    // 8. Tìm sản phẩm theo mức giá:
    public void timSpTheoGia() {
        System.out.println("Nhap gia can tim:");
        double i = sc.nextDouble();
        for (SanPham sPham : listSanPham) {
            if (i == sPham.getGiaBan()) {
                System.out.println(sPham.toString());
            }
        }
    }

    // 9.Dưới 50.000
    public void spDuoi50k() {
        System.out.println("San Pham Duoi 50.000: ");
        for (SanPham sPham : listSanPham) {
            if (num > sPham.getGiaBan()) {
                System.out.println(sPham.toString());

            }
        }
    }

    // 10.Từ 50.000 đến dưới 100.000
    public void spTren50kDuoi100k() {
        System.out.println("San Pham Tu 50.000 den 100.000: ");
        for (SanPham sPham : listSanPham) {
            if (num <= sPham.getGiaBan() && num2 >= sPham.getGiaBan()) {
                System.out.println(sPham.toString());
            }
        }
    }

    // 11.Từ 100.000 trở lên
    public void spTren100k() {
        System.out.println("San Pham hon 100.000");
        for (SanPham sPham : listSanPham) {
            if (num2 <= sPham.getGiaBan()) {
                System.out.println(sPham.toString());
            }
        }
    }

}
