public class Cat extends Animal {

        public String sounds(){
                String purr ="";
                setName("Storm");
                purr = this.getName()+" Meows";
                System.out.println(purr);
                return purr;
        }
}
