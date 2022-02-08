package ie.gmit.passenger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Passenger {

    public static void main(String[] args) {
        SpringApplication.run(Passenger.class, args);
    }
    String title;
    String name;
    String id;
    long phone;
    int age;


    public String getTitle(){return title;}
    public String getName(){return name;}
    public String getId(){return id;}
    public long getPhone(){return phone;}
    public int getAge(){return age;}

    public Passenger(String title, String name, String id, long phone, int age){

    }
    public void setTitle(String title){
        if(title == "Mr"|| title == "mr"|| title == "Mrs"||title == "mrs" || title == "ms"|| title == "Ms"){
            this.title = title;
        }
        else{
            throw new IllegalArgumentException("Invalid title provided");
        }
    }

}
