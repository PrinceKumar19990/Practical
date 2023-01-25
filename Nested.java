class Nestedif{

public static void main(String []args){
String address="KOlkata, India";

if(address.endsWith("India")){

if(address.contains("Dunlop")){
System.out.println("your city is dunlop");
}
else if (address.contains("newtown")){
System.out.println("your city is Newtown");
}
else{
System.out.println(address.split(",")[0]);
}

}else{
System.out.println("you are not living in India");
}
}
}