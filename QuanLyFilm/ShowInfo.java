package QuanLyFilm;

import java.util.Scanner;

public class ShowInfo {
    private static Scanner sc;

    // tao mang quan ly Movie
    static void getAllMovie() {
        // Mảng Quản lý Movie
        Movie[] Movies = new Movie[6];
        Movies[0] = new Movie("MV01", "Phim A", 3.5, TheLoai.SCIENCE, 30, "Nguyen Van A");
        Movies[1] = new Movie("MV02", "Phim B", 5, TheLoai.COMEDY, 50, "Nguyen Van B");
        Movies[2] = new Movie("MV03", "Phim C", 2.5, TheLoai.DOCUMENTATRY, 40, "Nguyen Van C");
        Movies[3] = new Movie("MV04", "Phim D", 4, TheLoai.HORROR, 45, "Nguyen Van D");
        Movies[4] = new Movie("MV05", "Phim E", 3.5, TheLoai.COMEDY, 60, "Nguyen Van E");
        Movies[5] = new Movie("MV06", "Phim F", 4, TheLoai.ANIME, 49, "Nguyen Van F");

        // In Ra Màn hình thông tin Film :
        for (int i = 1; i < Movies.length; i++) {
            System.out.println(i + ".Ten phim : " + Movies[i].getTenFilm());
            System.out.println("ID : " + Movies[i].getID());
            System.out.println("The loai: " + Movies[i].getTheLoai());
            System.out.println("Thoi luong: " + Movies[i].getThoiLuong() + " phut");
            System.out.println("Xep hang: " + Movies[i].getRanking() + "*");
            System.out.println("Dao Dien: " + Movies[i].getTacGia());
            System.out.println("------");
        }
        // Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Keyword :");
        String idInput = sc.nextLine();
        for (int i = 0; i < Movies.length; i++) {
            Movie Film = Movies[i];
            if (Film.hasKeyword(idInput)) {
                System.out.println("Result :");
                System.out.println(Movies[i].getTenFilm());

            }
        }
        // Tim ten Film theo the loai : Vd: COMEDY:
        System.out.println("The loai COMEDY gom co Film: ");
        for (int i = 0; i < Movies.length; i++) {
            if (Movies[i].getTheLoai() == TheLoai.COMEDY) {
                System.out.println(Movies[i].getTenFilm());
            }
        }

        Double checkRanking = 10.0; // Ranking cao nhat la 10.0

        // tinh ranking thap nhat
        for (int i = 0; i < Movies.length; i++) {
            if (Movies[i].getTheLoai() == TheLoai.COMEDY && Movies[i].getRanking() < checkRanking) {
                checkRanking = Movies[i].getRanking();
            }
        }
        // in ra tac gia co ranking thap nhat
        for (int i = 0; i < Movies.length; i++) {
            if (Movies[i].getTheLoai() == TheLoai.COMEDY && Movies[i].getRanking() == checkRanking) {
                System.out.println("Tac gia co Ranking thap nhat the loai COMEDY la: " + Movies[i].getTacGia() + " "
                        + Movies[i].getRanking());
            }
        }

    }

    static void getALLSeries() {
        Series[] Series = new Series[7];
        Series[0] = new Series("SR01", "A", 5, TheLoai.COMEDY, 30, 20, "Nguyen Van A");
        Series[1] = new Series("SR02", "B", 4, TheLoai.DOCUMENTATRY, 25, 40, "Nguyen Van B");
        Series[2] = new Series("SR03", "C", 8, TheLoai.HORROR, 10, 60, "Nguyen Van C");
        Series[3] = new Series("SR04", "D", 4, TheLoai.ANIME, 30, 45, "Nguyen Van D");
        Series[4] = new Series("SR05", "E1", 2, TheLoai.COMEDY, 45, 30, "Nguyen Van E");
        Series[5] = new Series("SR05", "E2", 6, TheLoai.SCIENCE, 45, 30, "Nguyen Van F");
        Series[6] = new Series("SR05", "E3", 1, TheLoai.COMEDY, 45, 30, "Nguyen Van G");

        // Nhập vào từ khoá tiêu đề film và tìm phim theo tiêu đề Series:

        Scanner sc = new Scanner(System.in);
        System.out.println("Input Keyword :");
        String idInput = sc.nextLine();
        for (int i = 0; i < Series.length; i++) {
            Series Film = Series[i];
            if (Film.hasKeyword(idInput)) {
                System.out.println("Result Search :");
                System.out.println(Series[i].getTenFilm());

            }
        }

        Double checkRanking = 10.0; // Ranking cao nhat la 10.0
        // tinh ranking thap nhat
        for (int i = 0; i < Series.length; i++) {
            if (Series[i].getTheLoai() == TheLoai.COMEDY && Series[i].getRanking() < checkRanking) {
                checkRanking = Series[i].getRanking();
            }
        }
        // in ra tac gia co ranking thap nhat
        for (int i = 0; i < Series.length; i++) {
            if (Series[i].getTheLoai() == TheLoai.COMEDY && Series[i].getRanking() == checkRanking) {
                System.out.println("Tac gia co Ranking thap nhat the loai COMEDY la: " + Series[i].getTacGia() + " "
                        + Series[i].getRanking());
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(" Mang  Quan Ly Movies :");
        getAllMovie();

        System.out.println("--------------------");

        System.out.println("Mang quan ly Series :");
        getALLSeries();

    }

}
