class AdditionRunner{
	public static void main(String []ars){
		System.out.println("main method started");
		int sum=Addition.add(3, 4);
		System.out.println(sum);
		int sum1=Addition.add(3, 4, 7);
		System.out.println(sum1);
		System.out.println("main method ended");
	}
}