package july18;

import java.util.LinkedList;
//CC307
public class AnimalQueue {
	LinkedList<Dog> dogs=new LinkedList<Dog>();
	LinkedList<Cat> cats=new LinkedList<Cat>();
	private int order=0;
	//annonymous class
	public void enqueue(Animal a){
		a.setOrder(order);
		order++;
		if(a instanceof Dog){
			dogs.add((Dog) a);
		}else{
			cats.add((Cat) a);
		}
	}
	public Animal dequeueAny(){
		if(dogs.size()==0){
			return cats.poll();
		}else if(cats.size()==0){
			return dogs.poll();
		}
		Dog dog=dogs.peek();
		Cat cat=cats.peek();
		if(dog.isOlderThan(cat)){
			return dogs.poll();
		}else{
			return cats.poll();
		}
	}
	public Dog dequeueDog(){
		return dogs.getFirst();
	}
	public Cat dequeueCat(){
		return cats.getFirst();
	}
	public static void main(String args[]){
		Animal d1=new Dog("hello");
		Animal c1=new Cat("2");
		AnimalQueue a=new AnimalQueue();
		a.enqueue(d1);
		a.enqueue(c1);
		Dog d=a.dequeueDog();
		System.out.println(d.name);
		
		
		
		
	}
}
