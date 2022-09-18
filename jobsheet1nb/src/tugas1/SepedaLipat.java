package tugas1;
public class SepedaLipat extends SepedaGunung{
    private boolean lipat=false;
    
    public void melipat(){
        lipat=true;
    }
    
    public void membuka(){
        lipat=false;
    }
    
    public void printStatus(){
        super.printStatus();
        System.out.println("Mode lipat : " + lipat);
    }
}