// interface , implementation 

interface SBI_ATM{
    // get balance .......
    int getBalance();
    void getReciept();
    void changePassword();
}

class PNB_bank implements SBI_ATM{

    public int getBalance(){
        System.out.println("this is get balance function");
        return 2000;
    }
    public void getReciept(){
        System.out.println("2000 in balance");
    }
    public void changePassword(){
        System.out.println("now your pssword is chnged");
    }
    void getPassBook(){
        System.out.println("Passbook printed");
    }
}


class CollectionTest{
    public static void main(String[] args) {
        // interfaces dont have object
        

        PNB_bank ref1 = new PNB_bank();
        ref1.changePassword();
        ref1.getBalance();
        ref1.getPassBook();

        SBI_ATM ref2 = new PNB_bank();
        ref2.changePassword();
        ref2.getPassBook();

        // SBI_ATM obj = new SBI_ATM();
    }
}
