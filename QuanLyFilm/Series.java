package QuanLyFilm;

public class Series extends Film{
   
    private int soTap;
    private int thoiLuongTB;

    
    public Series(String iD, String tenFilm, double ranking, TheLoai theLoai, int soTap, int thoiLuongTB, String tacGia) {
        super(iD, tenFilm, ranking, theLoai,tacGia);
        this.soTap = soTap;
        this.thoiLuongTB = thoiLuongTB;
    }
    public int getSoTap() {
        return soTap;
    }
    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }
    public int getThoiLuongTB() {
        return thoiLuongTB;
    }
    public void setThoiLuongTB(int thoiLuongTB) {
        this.thoiLuongTB = thoiLuongTB;
    }

    

}
