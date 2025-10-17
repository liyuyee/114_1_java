public class AccountTest {
    private static int customerCount;
    public static void main(String[] args){
        Account[] customers = new Account[10];
        Account acc1 = new Account("A001","u",65666);
        addCustomer(customers,acc1);
        Account acc2 = new Account("A002","y",6566);
        addCustomer(customers,acc2);
        Account acc3 = new Account("A003","f",6666);
        addCustomer(customers,acc3);

        System.out.println("\n所有客戶帳號資訊");
        printCustomerAccounts(customers);
    }

    public  static  void addCustomer(Account[]customers,Account newAccount){
        if (customerCount < customers.length){
            customers[customerCount] = newAccount;
            customerCount++;
            System.out.println("新增客戶成功:"+newAccount.getAccountNumber());
            return;
        }
        System.out.println("無法新贈客戶,客戶數量已達上限");
    }
    public static void printCustomerAccounts(Account[]customer){
        for (int i = 0;i<customerCount;i++){
            printCustomerInfo(customer[i]);
        }
    }

    public static void printCustomerInfo(Account account){
        System.out.println("帳戶號碼:"+account.getAccountNumber()+
                        "持有人:"+account.getOwnerName()+
                        "餘額:"+account.getBalance());
    }
}
