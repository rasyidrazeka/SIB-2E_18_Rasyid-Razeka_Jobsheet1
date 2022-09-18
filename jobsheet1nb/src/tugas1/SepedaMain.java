package tugas1;
public class SepedaMain {
    public static void main(String[] args){
        SepedaGunung spd1 = new SepedaGunung();
        SepedaLipat spd2 = new SepedaLipat();
        
        spd1.setMerk("United");
        spd1.tambahGear();
        spd1.tambahKecepatan(20);
        spd1.kurangGear();
        spd1.kurangKecepatan(10);
        spd1.printStatus();
        System.out.println();
        
        spd2.setMerk("Pacific");
        spd2.membuka();
        spd2.tambahGear();
        spd2.tambahKecepatan(30);
        spd2.kurangGear();
        spd2.kurangKecepatan(5);
        spd2.melipat();
        spd2.printStatus();
    }
}
