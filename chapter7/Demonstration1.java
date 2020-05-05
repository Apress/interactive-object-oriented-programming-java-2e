package java2e.chapter7;
import java2e.chapter7.companya.*;
import java2e.chapter7.companyb.*;

/*
import java2e.chapter7.companya.GoaPackage;
import java2e.chapter7.companya.KeralaPackage;
import java2e.chapter7.companyb.AndamanPackage;
*/



//import java2e.chapter7.companya.subpacka.*;


class Demonstration1 {

	public static void main(String[] args) {
	System.out.println("***Demonstration-1.Exploring packages.***");
        //Only Company-a has KeralaPackage
        KeralaPackage companyAKeralaPackage=new KeralaPackage();
        companyAKeralaPackage.showPrice();
        //Only Company-b has AndamanPackage
        AndamanPackage companyBAndamanPackage=new AndamanPackage();
        companyBAndamanPackage.showTariff();
        //Company-a and company-b both have package tours for Goa.
       //GoaPackage companyAGoaPackage=new GoaPackage();  //Error.you need to import explicitly now.
        java2e.chapter7.companya.GoaPackage companyAGoaPackage=new java2e.chapter7.companya.GoaPackage(); 
        companyAGoaPackage.showPrice();        

        java2e.chapter7.companyb.GoaPackage companyBGoaPackage=new java2e.chapter7.companyb.GoaPackage();
        companyBGoaPackage.showTariff();
        //This part is added for Q&A 7.1
        //Subpackages will not be imported by default.
        //Need to import the package explicitly.
        //import java2e.chapter7.companya.subpacka.*;
        //SubGoaPackage companyASubGoaPackage=new SubGoaPackage();        
        //companyASubGoaPackage.showPrice(); 
        
	}
}
