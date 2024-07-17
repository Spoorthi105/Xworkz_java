class Dominos{
public static double takeOrder(String foodName){
if(foodName=="Halwa"){
return 120.00;
}
if(foodName=="Petha"){
return 130.00; 	
}
if(foodName=="Kaju Katl"){
return 140.00;
}
if(foodName==" Malpua"){
return 150.00;
}
if(foodName=="Doodhpuri"){
return 250.00;
}
if(foodName=="Mysore Pak"){
return 160.00;
}
if(foodName=="Pedha"){
return 170.00;
}
if(foodName=="Shrikhand"){
return 180.00;
}
if(foodName=="Falooda"){
return 190.00;
}
if(foodName=="Kulfi"){
return 200.00;
}
if(foodName=="Barfi"){
return 210.00;
}
if(foodName=="Laddu"){
return 220.00;
}
if(foodName==" Jalebi "){
return 230.0;
}
if(foodName=="Ras Malai"){
return 240.00;
}
if(foodName=="Gulab Jamun"){
return 260.00;
}
else{
	System.out.println("not found");

}
return 0.0;
}

}



