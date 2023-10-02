package spring_imtroduction;

public class Person {
    private Pet pet;
    private String surname;
    private Integer age;
    public Person(){
        System.out.println("Person bean is created!");
    }

    public Person (Pet pet){
        this.pet = pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hey my lovely!");
        pet.say();
    }

}
