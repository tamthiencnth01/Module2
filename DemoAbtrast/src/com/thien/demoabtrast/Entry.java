package com.thien.demoabtrast;

public class Entry {
    public static void main(String[] args) {
        NhanVienFullTime nv1 = new NhanVienFullTime("Thien",Config.sep,8);

        nv1.xuatThongTin();

        NhanVienFullTime nv2 = new NhanVienFullTime("Long",Config.linh,10);
        nv2.xuatThongTin();
        NhanVienPartTime nv3 = new NhanVienPartTime("Nam",30);
        nv3.xuatThongTin();
    }
}
