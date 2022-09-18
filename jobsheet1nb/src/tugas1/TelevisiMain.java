package tugas1;
public class TelevisiMain {
    public static void main(String[] args){
        Televisi tv = new Televisi();
        
        tv.kurangChannel();
        tv.kurangVolume(2);
        tv.pilihChannel(2);
        System.out.println();
        
        tv.setMerk("SHARP");
        tv.onTv();
        tv.tambahChannel();
        tv.tambahVolume(12);
        tv.printStatus();
        tv.offTv();
        System.out.println();
        
        tv.setMerk("LG");
        tv.onTv();
        tv.tambahChannel();
        tv.pilihChannel(10);
        tv.kurangVolume(7);
        tv.offTv();
        tv.printStatus();
    }
}
