package com.course.springbootstarter.penyelenggara;

import java.io.Serializable;

public class Penyelenggara implements Serializable {
    private String kode;
    //    @Column(name="nama_instansi")
    private String nama;

    public Penyelenggara(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public Penyelenggara() {
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
