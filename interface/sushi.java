class Sushi implements Edible {
	private String name;
	private String chef;
	private int rating;
	
	public Sushi(String name, String chef, int rating) {
		this.name = name;
		this.chef = chef;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getChef() {
		return chef;
	}

	public void setChef(String chef) {
		this.chef = chef;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String howToEat() {
		return "Eat with chopsticks";
	}
	
	@Override
	public String toString(){
		return name + " by " + chef + ". Stars: " + rating;
	}
}
