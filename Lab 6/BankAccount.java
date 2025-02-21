
class Bank_Account {
   int AccountNo;
   String userName;
   String email;
   String AccountType;
   int Accountbalance;

   public Bank_Account(int AccountNo, String userName, String email, String AccountType, int Accountbalance) {
      this.AccountNo = AccountNo;
      this.userName = userName;
      this.email = email;
      this.AccountType = AccountType;
      this.Accountbalance = Accountbalance;
   }

   public String getAccountdetails() {
      return "Account number : " + AccountNo + "Account Type : " + AccountType + "Account Balance : " + Accountbalance +
            "Email : " + email + "User Name : " + userName;
   }

   public void displayAccountdetails() {
      System.out.println(AccountNo);
      System.out.println(AccountType);
      System.out.println(Accountbalance);
      System.out.println(email);
      System.out.println(userName);

   }
}

public class BankAccount {
   public static void main(String[] args) {
      Bank_Account b = new Bank_Account(1234567899, "Heet", "@gmail.com", null, 0);
      String Account_Details = b.getAccountdetails();
      System.out.println(Account_Details);
      b.displayAccountdetails();

   }
}
