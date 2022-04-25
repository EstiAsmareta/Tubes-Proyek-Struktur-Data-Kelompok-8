/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author ASUS TUF
 */
//inisialisasi dat yang akan diisi di menu utama nanti
public class LinkListData {
        public String Nama;
        public String NIK;
        public String TTL;
        public String Alamat;
        public String Email;
        public String JenisKelamin;
        public String NomorPendaftaran;
        public LinkListData next;
        
        //fungsi untuk menambah data kedalam objek
        public LinkListData(String Nama, String NIK,String TTL,String Alamat,String Email, String JenisKelamin, String detik,String NomorPendaftaran) {
            
            
            this.Nama = Nama;
            this.NIK = NIK;
            this.TTL = TTL;
            this.Alamat = Alamat;
            this.Email = Email;
            this.JenisKelamin = JenisKelamin;
            this.NomorPendaftaran = NomorPendaftaran;
            this.next = null;
        }
} 
