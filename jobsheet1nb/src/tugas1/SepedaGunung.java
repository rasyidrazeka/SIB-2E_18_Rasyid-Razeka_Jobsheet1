package tugas1;
public class SepedaGunung {
    private String merk;
    private int kecepatan=0;
    private int gear=1;
    
    public void setMerk(String newMerk){
        merk=newMerk;
    }
    
    public void tambahGear(){
        if(gear>6){
            System.out.println("Gear paling tinggi");
        }else{
            gear+=1;
        }
    }
    
    public void kurangGear(){
        if(gear<1){
            System.out.println("Gear paling rendah");
        }else{
            gear-=1;
        }
    }
    
    public void tambahKecepatan(int newKecepatan){
        kecepatan+=newKecepatan;
    }
    
    public void kurangKecepatan(int newKecepatan){
        kecepatan-=newKecepatan;
    }
    
    public void printStatus(){
        System.out.println("Merek : " + merk);
        System.out.println("Gear : " + gear);
        System.out.println("Kecepatan : " + kecepatan);
    }
}