class Visa{
public static boolean createMyVisa(String nationality, String passPortType, String portOfArrival,
String dateOfBirth,String ExpectedDateOfArrival){
boolean iscreated=false;

System.out.println("Nationality:"+nationality);
System.out.println("Pass POrt Type:"+passPortType);
System.out.println("POrt of arrival"+portOfArrival);
System.out.println("DOB :"+dateOfBirth);
System.out.println("dateOfArrival"+ExpectedDateOfArrival);

return iscreated;
}

}