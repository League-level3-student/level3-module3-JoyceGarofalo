package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		Animal[] farm = new Animal[4];
		farm[0] = new Cow();
		farm[1] = new Chicken();
		farm[2] = new Horse();
		farm[3] = new Pig();
		for (int i = 0; i < farm.length; i++) {
			farm[i].makeNoise();
			farm[i].nameAnimal();
		}
	}
}
