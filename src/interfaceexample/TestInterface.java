package interfaceexample;

class TestInterface 
{  
public static void main(String[] args)
{  
Bank b=new SBI();  
System.out.println("ROI: "+b.rateOfInterest());  
 

Bank obj = new PNB();
System.out.println("ROI: "+obj.rateOfInterest());

SBI obj1 = new SBI();
System.out.println("ROI: "+obj1.rateOfInterest());
 

}
}  