public class SanPham {
    private String name;
    private String id;
    private String moTa;
    private int soLuong;
    private double giaBan;
    private String donViTinh;

    public SanPham(String name, String id, String moTa, double giaBan, int soLuong, String donViTinh) {
        this.name = name;
        this.id = id;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.donViTinh = donViTinh;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "\nSanPham [donViTinh=" + donViTinh + ", giaBan=" + giaBan + ", id=" + id + ", moTa=" + moTa + ", name="
                + name + ", soLuong=" + soLuong + "]";
    }

}
