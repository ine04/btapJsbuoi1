//Bai 1

public class Person {
    int namsinh;
    String name;

    public int PredictAge(){
        return 2024 - namsinh;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.namsinh = 2004; 
        person1.name = "Ho Yen";

        int tuoi = person1.PredictAge();

        System.out.println("Tuoi cua " + person1.name + " la: " + tuoi);
    }
    
}




