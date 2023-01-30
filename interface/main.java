public class Main {
	public static void main(String[] args) {
		Edible[] edibles = new Edible[4];
		edibles[0] = new Sushi("Maguro", "Suke", 5);
		edibles[1] = new Sushi("Tako", "Suke", 4);
		edibles[2] = new Soup("Chicken Soup", "Ken", 4);
		edibles[3] = new Soup("Beef Soup", "Ken", 5);
		
		for(Edible e: edibles){
			System.out.println(e);
			System.out.println(e.howToEat());
			System.out.println(e.howToCook());
			System.out.println();
		}
	}
}