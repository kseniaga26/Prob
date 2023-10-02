package spring_imtroduction;

public class Test2 {
    public static void main(String[] args){
        Pet pet = new Dog();
        Person person = new Person(pet);
        person.callYourPet();
    }
}
