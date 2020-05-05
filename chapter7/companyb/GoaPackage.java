package java2e.chapter7.companyb;

public class GoaPackage {
	int basic_price = 15000;
	int serviceTax = 2000;

	public void showTariff() {
		int forTwoPerson = basic_price * 2 + serviceTax;
		int forFourPerson = basic_price * 4 + serviceTax;
		System.out.println("***Tariff for Goa tour in Company B***");
		System.out.println("In Company B:For two persons , Goa tour package is Rs." + forTwoPerson);
		System.out.println("In Company B:For four persosn , Goa tour package is Rs." + forFourPerson);
		System.out.println("****************");
	}
}