package SpringCore;

public class Tank {
    private boolean isUse;
    private int volumeLeft;

    public Tank(int volumeLeft) {
        this.volumeLeft = volumeLeft;
    }

    public boolean isUse() {
        return isUse;
    }

    public void setUse(boolean use) {
        isUse = use;
    }

    public int getVolumeLeft() {
        return volumeLeft;
    }

    public void setVolumeLeft(int volumeLeft) {
        this.volumeLeft = volumeLeft;
    }

    public synchronized void use(int volumeNeeded) throws Exception{
        System.out.println(Thread.currentThread().getName());
        if (isUse){
            throw new Exception("Hozir ishlamoqda ");
        }else if (getVolumeLeft()<volumeNeeded){
            throw new Exception("Siz suragan miqdorda ishimlik mavjud emas ");
        }else {
            setUse(true);
            setVolumeLeft(getVolumeLeft()-volumeNeeded);
            System.out.println("qolgan ichimlik miqdori :"+ getVolumeLeft());
            System.out.println("------------------------------------------");
        }
    }
}
