

/**
 *
 * @author
 * Nama : Heri Kurniawan
 * Kelas : PBO112B
 * NIM : 2022432851
 * Deskripsi Program : Program Ini Berisi Latihan 57 Vehicle
 */

package pbo112b.pkg2022432851.latihan57.vehicle;


public class PBO112b2022432851Latihan57Vehicle {


    public static void main(String[] args) {
        
        Bicycle hki = new Bicycle();
        hki.setMyBrand("Trex Bike");
        hki.setMyModel("7.4FX");
        hki.setMyGearCount(23);
        System.out.println("Bicycle");
        System.out.println("Brand : "+hki.getMyBrand());
        System.out.println("Model : "+hki.getMyModel());
        System.out.println("Jumlah Gear : "+hki.getMyGearCount());
        
        System.out.println("");
        
        Skateboard hki1 = new Skateboard();
        hki1.setMyBrand("Trex Bike");
        hki1.setMyModel("7.4FX");
        hki1.setMyBoardLength(54.5);
        System.out.println("SkateBoard");
        System.out.println("Brand : "+hki1.getMyBrand());
        System.out.println("Model : "+hki1.getMyModel());
        System.out.println("Panjangnya Board : "+hki1.getMyBoardLength());

    }
    
}
