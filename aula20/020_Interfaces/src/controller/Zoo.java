package controller;
import java.util.ArrayList;
import model.*;

public class Zoo {

	public static void main(String[] args) {

		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Cachorro("krypto"));
		animals.add(new Gato("Bella"));
		animals.add(new Cachorro("Rocky"));
		animals.add(new Gato("Molly"));
		animals.add(new Periquito("P1"));
		animals.add(new Periquito("P2"));
		
		for (Animal animal: animals) {
			System.out.println(animal.seuNome()+ " : "+ animal.seuBarulho()); 
		}
	}

}
