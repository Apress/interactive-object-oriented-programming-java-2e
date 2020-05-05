package java2e.chapter7.companyb;

public class AndamanPackage 
{
        int basePrice=12000;
        public void showTariff()
        {
                System.out.println("***Tariff for Andaman tour in Company B***" );
                System.out.println("In Company B:For two persons, Andaman tour package is Rs."+ basePrice*2 );
                System.out.println("In Company B:For four persons, Andaman tour package is Rs."+ basePrice*4 );
                System.out.println("**************" );
        }
}
