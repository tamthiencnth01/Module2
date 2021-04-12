package com.thien.demoabtrast;

public abstract class NhanVien {
    protected String name;
    protected long salary;

    public NhanVien(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public NhanVien(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }
    protected abstract String loaiNhanVien();
    public abstract void tinhLuong();
    public void xuatThongTin(){
        tinhLuong();
        System.out.println("Name: "+this.name+" Loai Chuc Vu: "+ loaiNhanVien() +" Salary: "+this.salary);
    }
}
