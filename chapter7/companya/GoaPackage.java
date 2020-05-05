package java2e.chapter7.companya;

public class GoaPackage 
{
        int basePrice=10000;
        public void showPrice()
        {
                System.out.println("***Tariff for Goa tour in Company A***" );
                System.out.println("For two person , Goa tour package is Rs."+ basePrice*2 );
                System.out.println("For four person , Goa tour package is Rs."+ basePrice*4 );
                System.out.println("**************" );
        }
}
