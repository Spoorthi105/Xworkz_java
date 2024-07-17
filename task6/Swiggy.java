class Swiggy{
public static double takeOrder(String foodName){
if(foodName=="idli"){
return 31.00;
}

if(foodName=="doosa"){
return 32.00; 	
}

if(foodName=="poha"){
return 33.00;
}
if(foodName=="meduVada"){
return 34.00;
}
if(foodName=="alooParota"){
return 35.00;
}
if(foodName=="lemonRice"){
return 36.00;
}
if(foodName=="pilioggare"){
return 37.00;
}
if(foodName=="vangiBath"){
return 38.00;
}
if(foodName=="bisiBeleBath"){
return 39.00;
}
if(foodName=="maddurvada"){
return 40.00;
}
if(foodName=="nippatMasala"){
return 41.00;
}
if(foodName=="upma"){
return 42.00;
}
if(foodName=="pongal"){
return 40.0;
}
if(foodName=="tomatoBath"){
return 44.00;
}
if(foodName=="pavBaji"){
return 45.00;
}
return 0.0;
}
public static double takeOrder(String foodName, int quantity ){
 double price = 0.0;
 if(foodName=="doosa") {
	 price = 32.00 * quantity;
	 return price;
 }
 return price;
}
}

