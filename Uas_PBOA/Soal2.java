class Pegawai {

  public string nama;
  public string jabatan;
  public double pajak;
  private double gajiPokok;
  private double gajiBersih;

  constructor(string nama, jabatan, pajak) {
    this.nama = nama;
    this.jabatan = jabatan;
    this.pajak = pajak;
  }


  setGajiPokok(gajiPokok) {
    this.gajiPokok = gajiPokok;
  }


  getGajiBersih() {

    this.gajiBersih = this.gajiPokok - (this.gajiPokok * this.pajak);
    return this.gajiBersih;
  }


  display() {
    console.log("Nama: " + this.nama);
    console.log("Jabatan: " + this.jabatan);
    console.log("Gaji Pokok: " + this.gajiPokok);
    console.log("Gaji Bersih: " + this.getGajiBersih());
  }
}


let pegawai1 = new Pegawai("Joni", "Manager", 0.1);


pegawai1.setGajiPokok(3000000);


pegawai1.display();


public class Lingkaran {

  public static void main(String[] args) {
    
  }
}