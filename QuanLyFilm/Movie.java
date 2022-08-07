package QuanLyFilm;


public class Movie extends Film{

    
    public static int length;
    private int thoiLuong;


    public Movie(String iD, String tenFilm, double ranking, TheLoai theLoai, int thoiLuong, String tacGia) {
        super(iD, tenFilm, ranking, theLoai, tacGia );
        //TODO Auto-generated constructor stub
        this.thoiLuong = thoiLuong;
    }
    
    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    
    
}