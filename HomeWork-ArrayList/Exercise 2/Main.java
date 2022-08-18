import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ListSanPham sanpham = new ListSanPham();
        int luaChon = 0;
        do {
            System.out.println("----------MENU---------");
            System.out.println(
                              "1.  Them san pham vao danh sach.\n"
                            + "2.  Hien thi danh san pham.\n"
                            + "3.  Tim san pham theo ten.\n"
                            + "4.  Tim san pham theo ID.\n"
                            + "5.  Xoa san pham theo ID.\n"
                            + "6.  Cap nhap so luong san pham theo ID.\n"
                            + "7.  Cac san pham co so luong duoi 5.\n"
                            + "8.  Tim cac san pham theo muc gia.\n"
                            + "9.  San pham < 50.000.\n"
                            + "10. San pham 50.000 => 100.000.\n"
                            + "11.  San pham > 100.000.\n"
                            + "0.  Thoat..!");
            System.out.println("Vui long chon: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if (luaChon == 1) {
                System.out.println("Nhap ten San Pham: ");
                String name = sc.nextLine();
                System.out.println("Nhap ma so San Pham (SP01,SP02,...) ");
                String id = sc.nextLine();
                System.out.println("Loai San Pham: ");
                String moTa = sc.nextLine();
                System.out.println("Nhap Gia Ban: ");
                Double giaBan = sc.nextDouble();
                System.out.println("Nhap So Luong: ");
                int soLuong = sc.nextInt();
                System.out.println("Doi Vi Tinh: ");
                String donViTinh = sc.nextLine();
                sc.nextLine();
                SanPham sp = new SanPham(name, id, moTa, giaBan, soLuong, donViTinh);
                sanpham.themSanPhamMoi(sp);
            } else if (luaChon == 2) {
                sanpham.xemDanhSachSanPham();
            } else if (luaChon == 3) {
                sanpham.timSanPhamTheoTen();
            } else if (luaChon == 5) {
                sanpham.xoaSanPhamTheoId();
            } else if (luaChon == 6) {
                sanpham.capNhapSoLuongSp();
            } else if (luaChon == 7) {
                sanpham.spCoSoLuongDuoi5();
            } else if (luaChon == 8) {
                sanpham.timSpTheoGia();
            } else if (luaChon == 9) {
                sanpham.spDuoi50k();
            } else if (luaChon == 10) {
                sanpham.spTren50kDuoi100k();
            } else if (luaChon == 11) {
                sanpham.spTren100k();
            }
        } while (luaChon != 0);
        
        // PHẦN COMENT CHẠY THÌ OKE MÀ CÁI PHẦN Ở TRÊN MÌNH CHẠY KHÔNG ĐC. :<

        // Scanner sc = new Scanner(System.in);
        // // Tạo sản phẩm

        // SanPham sanPham = new SanPham("Banh", "MS1", "Banh Ngot", 5, 10000, "goi");
        // SanPham sanPham2 = new SanPham("Banh2", "MS2", "Banh Man", 10, 50000, "goi");
        // SanPham sanPham3 = new SanPham("Keo", "MS3", "Keo Ngot", 15, 30500, "cai");
        // SanPham sanPham4 = new SanPham("Keo2", "MS4", "Keo Cao Su", 50, 5500, "cai");
        // SanPham sanPham5 = new SanPham("Ruou", "MS5", "Ruou vang", 2, 250000,
        // "chai");
        // SanPham sanPham6 = new SanPham("Thuoc La", "MS6", "Thang Long", 5, 14000,
        // "bao");
        // SanPham sanPham7 = new SanPham("Thuoc La2", "MS7", "3 So", 5, 60000, "bao");

        // // Them San Pham
        // ArrayList<SanPham> listSp = new ArrayList<>();
        // listSp.add(sanPham);
        // listSp.add(sanPham2);
        // listSp.add(sanPham3);
        // listSp.add(sanPham4);
        // listSp.add(sanPham5);
        // listSp.add(sanPham6);
        // listSp.add(sanPham7);

        // // In ra danh sach San Pham:
        // System.out.println(listSp.toString());

        // // tim San Pham theo ten
        // System.out.println("Nhap ten San Pham can tim: ");
        // String name = sc.nextLine();
        // for (SanPham sanpham : listSp) {
        // if (sanpham.getName().indexOf(name) >= 0) {
        // System.out.println(sanpham);
        // }
        // }
        // // tim San pham theo ID
        // System.out.println("Nhap ID san pham (vd: MS1,MS2,MS3,MS...: " );
        // String id = sc.nextLine();
        // for (SanPham idSanPham : listSp) {
        // if (idSanPham.getId().indexOf(id) >= 0) {

        // System.out.println(idSanPham);
        // }
        // }
        // // // Xoa SP theo ID
        // System.out.println("Nhap ID san pham can xoa (vd: MS1,MS2,MS3,MS...: " );
        // String id2 = sc.nextLine();
        // for (SanPham DeleteSp : listSp) {
        // if (DeleteSp.getId().indexOf(id2) >= 0) {
        // listSp.remove(DeleteSp);
        // System.out.println(listSp.toString());
        // }
        // }
        // // Cập nhập số lượng sản phẩm
        // System.out.println("Nhap ID san pham can kiem tra (vd: MS1,MS2,MS3,MS...: "
        // );
        // String id3 = sc.nextLine();
        // for (SanPham IdKiemTra : listSp) {
        // if (IdKiemTra.getId().indexOf(id3) >= 0) {
        // System.out.println("So luong con : " + IdKiemTra.getSoLuong() + " " +
        // IdKiemTra.getDonViTinh() );
        // }
        // }

        // // Tìm sản phẩm có số lượng dưới 5
        // System.out.println("San pham co so Luong duoi 5 la:");
        // for(SanPham num : listSp){
        // if(num.getSoLuong() < 5){
        // System.out.println(num.toString());
        // }
        // }
        // //Tim Sản Phẩm theo mức giá
        // System.out.println("San Pham Duoi 50.000");
        // double num = 50000;
        // double num2 = 100000;
        // for(SanPham sPham : listSp){
        // if(num > sPham.getGiaBan()){
        // System.out.println( sPham.toString());

        // }
        // }
        // System.out.println("San Pham Tu 50.000 den 100.000");
        // for(SanPham sPham : listSp){
        // if(num <= sPham.getGiaBan() && num2 >= sPham.getGiaBan() ){
        // System.out.println( sPham.toString());
        // }
        // }
        // System.out.println("San Pham hon 100.000");
        // for(SanPham sPham : listSp){
        // if( num2 <= sPham.getGiaBan() ){
        // System.out.println( sPham.toString());
        // }
        // }
    }
}