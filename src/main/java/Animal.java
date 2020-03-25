public class Animal {
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String eats()
    {
        return this.name+ " Food";
    }
        public String sounds()
        {
        return "a cow moos";
        }
}