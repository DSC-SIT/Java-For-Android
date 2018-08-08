class Animal{
	public void eat(){
	System.out.println("i can eat");
	}
        public void feature(){
        System.out.println("i have a feature!");
        }
}

class Dog extends Animal{
	public void feature(){
	System.out.println("i can gaurd");
	}
}

class Cat extends Animal{
	public void feature(){
	System.out.println("i just scratch you!");
}

class GuineaPig extends Animal{
	public void feature(){
	System.out.println("i can be cute..:P");
	}
}

class inheritance{
	public static void main(String args[]){
		Animal living = new Animal();
		Animal tommy = new Dog();
		Animal kitty = new Cat();
		kitty.feature();
		tommy.feature();
	}
}
