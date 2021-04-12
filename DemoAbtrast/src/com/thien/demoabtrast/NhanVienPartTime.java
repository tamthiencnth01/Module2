package com.thien.demoabtrast;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;

    public NhanVienPartTime(String name, int gioLamViec) {
        super(name);
        this.gioLamViec = gioLamViec;
    }

    @Override
    protected String loaiNhanVien() {
        return "Parttime";
    }

    @Override
    public void tinhLuong() {
        this.salary = Config.lamthemtieng*this.gioLamViec;
    }
}
