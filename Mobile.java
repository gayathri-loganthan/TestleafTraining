//Package
package class1.pack1;

//class
public class Mobile {

//Create Global Variable
String mobileBrand = "iPhone";
int mobileModel = 8;
boolean isUsed =true;	
	
//Method 1
public void makeCall() {
	//Create Local Variable
	long mobileNumber = 971447898525L;
	System.out.println("Make Call");
	System.out.println(mobileNumber);

}
 //Method 2
public void sendSms() {
	System.out.println("Send SMS");

}

//Method 3
public void takeSnap() {
	System.out.println("Take Snap");

}
//Main Method
public static void main(String[] args) {
	//create object for the class 
	Mobile myMobile = new Mobile();
	
	//call methods using the object
	myMobile.makeCall();
	myMobile.sendSms();
	myMobile.takeSnap();
	//Print global variables in Main Method
	System.out.println(myMobile.mobileBrand);
	System.out.println(myMobile.mobileModel);
	System.out.println(myMobile.isUsed);
}


}
