package SpringCore;

public class VendingMachineRunner implements Runnable{
    private VendingMachineHelper vendingMachineHelper;

    public VendingMachineRunner(VendingMachineHelper vendingMachineHelper) {
        this.vendingMachineHelper = vendingMachineHelper;
    }

    @Override
    public void run() {
        try {
            vendingMachineHelper.Drink();
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            vendingMachineHelper.getTank().setUse(false);
        }
    }
}
