public class Animal
{
    //All final attributes
    private String name; 
   private  String type;
    
 
    private Animal(AnimalBuilder builder) {
        this.name = builder.name;
        this.type = builder.type;
        
    }
 
    
    public String getname() {
        return name;
    }
    public String gettype() {
        return type;
    }
    
 
   
    public String toString() {
        return "Animal: "+this.name+", "+this.type;
    }
 
    public static class AnimalBuilder
    {
        private final String name;
        private final String type;
        
        public AnimalBuilder(String name, String type) {
            this.name = name;
            this.type = type;
        }
        
       
        
        public Animal build() {
            Animal animal =  new Animal(this);
           
            return animal;
        }
        
    }

public static void main(String[] args) {
    Animal animal1 = new Animal.AnimalBuilder("Lian", "Wild")
    .build();
 
    System.out.println(animal1);
 
    
Animal animal2 = new Animal.AnimalBuilder("Dog", "Domestic")
    .build();
    System.out.println(animal2);
 
  Animal animal3 = new Animal.AnimalBuilder("Tigher", "Wild")
    .build();
    System.out.println(animal3);
}}
 

