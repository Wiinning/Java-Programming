package ClassAndObject;

import java.util.UUID;

class Animal{
    private Integer id;
    private String uuid;
    private String name;
    private String color;
    private Character gender;

    public Animal(){};

    public Animal(Integer id, String uuid, String name, String color, Character gender) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.color = color;
        this.gender = gender;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public void setUuid(String uuid){

        this.uuid = uuid;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setGender(Character gender){
        this.gender= gender;
    }
    public int getId(){
        return this.id;
    }
    public String getUuid(){
        return this.uuid;
    }
    public String getName(){
        return this.name;
    }
    public String getColor(){
        return this.color;
    }
    public Character getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                '}';
    }
}
public class ConstructorPractice {
    public static void main(String[] args) {
       Animal animal1 = new Animal();
        System.out.println(animal1);
        Animal animal2 = new Animal(2, UUID.randomUUID().toString(), "Tiger", "Black", 'M');
        System.out.println(animal2);
        Animal animal3 = new Animal();
        animal3.setColor("White");
        System.out.println("The color of animal 3 is: " + animal3.getColor());


    }
}
