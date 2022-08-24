package QuanLyFilm;

/*
 * Viết chương trình quản lý phim gồm các thông tin
Tạo class Film gồm các thuộc tính:

id (String)
tiêu đề (String)
thể loại (enum: HORROR (kinh dị), COMEDY (hài hước), DOCUMENTATRY (tài liệu), bạn có thể bổ sung thêm )
ranking (double)
Tạo class Movie kế thừa Film và có thêm thuộc tính:

thời lượng (int) (tính theo phút)

Tạo class Series kế thừa Film và có thêm thuộc tính:
số tập (int)
thời lượng trung bình (int) (tính theo phút)

Khai báo access modifier cho các thuộc tính của các class là private hoặc protected ; KHÔNG DÙNG public
Khai báo các getter/setter cho các class.

Thực hiện:

Tạo 2 mảng để quản lý Movie và Series
In thông tin phim ra màn hình
Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề ( tìm cả movie và series, tìm theo từ khoá)
In ra thông tin film có ranking thấp nhất (kiểm tra cả movie và series)
In ra tên đạo diễn của thể loại COMEDY có ranking thấp nhất
 */
enum TheLoai {
    HORROR,
    COMEDY,
    DOCUMENTATRY,
    ANIME,
    SCIENCE;
}

public class Film {
    private String ID;
    private String tenFilm;
    private double Ranking;
    private TheLoai theLoai;
    private String tacGia;

    public Film(String iD, String tenFilm, double ranking, TheLoai theLoai, String tacGia) {
        ID = iD;
        this.tenFilm = tenFilm;
        Ranking = ranking;
        this.theLoai = theLoai;
        tacGia = tacGia;
        this.tacGia = tacGia;

    }

    public String getID() {
        return ID;
    }

    public void setID(String iD) {
        this.ID = iD;
    }

    public String getTenFilm() {
        return tenFilm;
    }

    public void setTenFilm(String tenFilm) {
        this.tenFilm = tenFilm;
    }

    public double getRanking() {
        return Ranking;
    }

    public void setRanking(double ranking) {
        this.Ranking = ranking;
    }

    public TheLoai getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(TheLoai theLoai) {
        this.theLoai = theLoai;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public boolean hasKeyword(String idInput) {
        boolean result = this.tenFilm.contains(idInput);
        return result;
    }
}
