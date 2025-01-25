public class Mobile {
    private String mobileOwnerName;
    private String mobileNumber;
    private double mobileBalance;
    private String mobileOSName;
    private boolean lock;

    public Mobile() {}

    public Mobile(String mobileOwnerName, String mobileNumber, double mobileBalance, String mobileOSName, boolean lock) {
        this.mobileOwnerName = mobileOwnerName;
        this.mobileNumber = mobileNumber;
        this.mobileBalance = mobileBalance;
        this.mobileOSName = mobileOSName;
        this.lock = lock;
    }

    public String getMobileOwnerName() {
        return mobileOwnerName;
    }

    public void setMobileOwnerName(String mobileOwnerName) {
        this.mobileOwnerName = mobileOwnerName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public double getMobileBalance() {
        return mobileBalance;
    }

    public void setMobileBalance(double mobileBalance) {
        this.mobileBalance = mobileBalance;
    }

    public String getMobileOSName() {
        return mobileOSName;
    }

    public void setMobileOSName(String mobileOSName) {
        this.mobileOSName = mobileOSName;
    }

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public void showDetails() {
        System.out.println("Mobile Owner Name: " + mobileOwnerName);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Mobile Balance: " + mobileBalance);
        System.out.println("Mobile OS Name: " + mobileOSName);
        if (lock) {
            System.out.println("Phone is locked");
        } else {
            System.out.println("Phone is unlocked");
        }
    }

    public void recharge(int amount) {
        if (amount > 0) {
            mobileBalance += amount;
            System.out.println("Recharged successfully. New balance: " + mobileBalance);
        }
        else {
            System.out.println("Invalid recharge amount.");
        }
    }

    public float adjustAfterCall(float timeDuration, float costPerMinute) {
        float cost = timeDuration * costPerMinute;
        if (mobileBalance >= cost) {
            mobileBalance -= cost;
            System.out.println("Call cost: " + cost);
            System.out.println("Adjusted Balance: " + mobileBalance);
        }
        else {
            System.out.println("Insufficient balance for the call.");
            cost = 0;
        }
        return cost;
    }
}
