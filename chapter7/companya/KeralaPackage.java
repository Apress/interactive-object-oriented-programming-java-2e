package java2e.chapter7.companya;

public class KeralaPackage 
{
        int basePrice=7000;
        public void showPrice()
        //private protected void showPrice()//error: cannot use both-private and protected
        {
                System.out.println("***Tariff for Kerala tour in Company A***" );
                System.out.println("For two person , Kerala tour package is Rs."+ basePrice*2 );
                System.out.println("For four person, Kerala tour package is Rs."+ basePrice*4 );
                System.out.println("**************" );
        }
}
