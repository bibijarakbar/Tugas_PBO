import java.text.DecimalFormat;
public class Data
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main (String[] args){
    //intansiasi objek Koperasi
    Koperasi Koperasi01 = new Koperasi();
    //mengisi data pada objeck Koperasi.
    Koperasi01.ID="K010";
    Koperasi01.nama="Arya Setiabudi";
    Koperasi01.alamat="Jl.RTM Kelapa Dua";
    Koperasi01.pinjam= 1600000;
    Koperasi01.angsuran = 200000;
 
    ///menganngi methodvoid()
    Koperasi01.cetakdata();
    Koperasi01.pinjam();
    Koperasi01.angsuran();
    
    //Memanggil Methodnonvoid
    System.out.println("Sumbangan Bencana : "+Koperasi01.hitungsumbangan());
    System.out.println("Cicilan Pertahun : "+Koperasi01.cicilanbulanan());
    System.out.println("Bunga : "+ df.format(Koperasi01.hitungbunga()));
 
}
}