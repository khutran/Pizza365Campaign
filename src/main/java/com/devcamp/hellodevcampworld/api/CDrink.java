package com.devcamp.hellodevcampworld.api;

public class CDrink {
    private long id;
    private String maNuocUong;
    private String tenNuocUong;
    private long giaNuocUong;
    private long ngayTao;
    private long ngayCapNhat;

    public CDrink() {
    }

    public CDrink(long id, String maNuocUong, String tenNuocUong, long giaNuocUong, long ngayTao, long ngayCapNhat) {
        this.id = id;
        this.maNuocUong = maNuocUong;
        this.tenNuocUong = tenNuocUong;
        this.giaNuocUong = giaNuocUong;
        this.ngayTao = ngayTao;
        this.ngayCapNhat = ngayCapNhat;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMaNuocUong() {
        return maNuocUong;
    }

    public void setMaNuocUong(String maNuocUong) {
        this.maNuocUong = maNuocUong;
    }

    public String getTenNuocUong() {
        return tenNuocUong;
    }

    public void setTenNuocUong(String tenNuocUong) {
        this.tenNuocUong = tenNuocUong;
    }

    public long getGiaNuocUong() {
        return giaNuocUong;
    }

    public void setGiaNuocUong(long giaNuocUong) {
        this.giaNuocUong = giaNuocUong;
    }

    public long getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(long ngayTao) {
        this.ngayTao = ngayTao;
    }

    public long getNgayCapNhat() {
        return ngayCapNhat;
    }

    public void setNgayCapNhat(long ngayCapNhat) {
        this.ngayCapNhat = ngayCapNhat;
    }
}
