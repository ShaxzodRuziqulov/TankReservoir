package SpringCore;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Tank tank = new Tank(5000);
        System.out.println("Hajm :" + tank.getVolumeLeft());
        System.out.println("---------------------------");
        for (int i = 0; i < 100; i++) {
            VendingMachineHelper vendingMachineHelper = new VendingMachineHelper(tank, 50);
            VendingMachineRunner vendingMachineRunner = new VendingMachineRunner(vendingMachineHelper);
            Thread thread = new Thread(vendingMachineRunner);
            thread.start();
            //Yuqoridagi oqim to'liq yakuniga yetmagunicha, quyidagi oqim ishga tushmaydi
//            thread.join();
        }
    }
}