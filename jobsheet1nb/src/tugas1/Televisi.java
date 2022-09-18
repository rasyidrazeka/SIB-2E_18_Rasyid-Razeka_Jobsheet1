package tugas1;
public class Televisi {
    private String merk;
    private boolean tombolOn=false;
    private int volume;
    private int channel=1;
    
    public void setMerk(String newMerk){
        merk=newMerk;
    }
    public void onTv(){
        tombolOn=true;
    }
    public void offTv(){
        tombolOn=false;
    }
    public void tambahVolume(int newVolume){
        if(tombolOn==false){
            System.out.println("Harap nyalakan tv terlebih dahulu!");
        }else{
            volume+=newVolume;
        }
    }
    public void kurangVolume(int newVolume){
        if(tombolOn==false){
            System.out.println("Harap nyalakan tv terlebih dahulu!");
        }else{
            volume-=newVolume;
        }
    }
    public void tambahChannel(){
        if(tombolOn==false){
            System.out.println("Harap nyalakan tv terlebih dahulu!");
        }else{
            if(channel>10){
                channel=1;
            }else{
                channel+=1;
            }
        }
    }
    public void kurangChannel(){
        if(tombolOn==false){
            System.out.println("Harap nyalakan tv terlebih dahulu!");
        }else{
            if(channel<1){
                channel=10;
            }else{
                channel-=1;
            }
        }
    }
    public void pilihChannel(int newChannel){
        if(tombolOn==false){
            System.out.println("Harap nyalakan tv terlebih dahulu!");
        }else{
            if(newChannel>10){
                System.out.println("Channel pilihan anda tidak tersedia");
            }else if(newChannel<1){
                System.out.println("Channel pilihan anda tidak tersedia");
            }else{
                channel=newChannel;
            }
        }
    }
    public void printStatus(){
        System.out.println("Merek TV : " + merk);
        System.out.println("Channel no : " + channel);
        System.out.println("Volume : " + volume);
    }
}