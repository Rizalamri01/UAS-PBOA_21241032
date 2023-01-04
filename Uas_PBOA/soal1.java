package lingkaran;

Class Lingkaran {
    Constructor(jariJari) {
      This.jariJari = jariJari;
    }
  
    hitungDiameter() {
      return 2 * this.jariJari;
    }
  
    hitungKeliling() {
      return 2 * Math.PI * this.jariJari;
    }
  
    hitungLuas() {
      return Math.PI * this.jariJari * this.jariJari;
    }
  
    Display() {
      Console.log(`Diameter lingkaran adalah: ${this.hitungDiameter()}`);
      Console.log(`Keliling lingkaran adalah: ${this.hitungKeliling()}`);
      Console.log(`Luas lingkaran adalah: ${this.hitungLuas()}`);
    }
  }
  
  Const lingkaran1 = new Lingkaran(7);
  Lingkaran1.display();
  
  
  
public class soal1 {
    public static void main(String[] args) {
        
    }
}
