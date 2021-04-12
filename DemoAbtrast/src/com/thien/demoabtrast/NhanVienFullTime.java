package com.thien.demoabtrast;

public class NhanVienFullTime extends NhanVien{
    private int loaiChucVu;
    private int ngayLamThem;

    public NhanVienFullTime(String name, int loaiChucVu, int ngayLamThem) {
        super(name);
        this.loaiChucVu = loaiChucVu;
        this.ngayLamThem = ngayLamThem;
    }
    @Override
    public String loaiNhanVien(){
        return (loaiChucVu==Config.sep) ? "sep" : "linh";
    }
    @Override
    public void tinhLuong(){
        switch (loaiNhanVien()){
            case "sep":
                this.salary = Config.luongsep + Config.lamthemngay*this.ngayLamThem;
                break;
            case "linh":
                this.salary = Config.luonglinh + Config.lamthemngay*this.ngayLamThem;
                break;
        }
    }
}
