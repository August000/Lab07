
public class HealthyPerson extends Person
{

    private String reason;
    
    public HealthyPerson(String name, int age, String reason)
    {
        super(name, age);
        this.reason = reason;
    }

    public String getReason(){
        return reason;
    }
    
    @Override
    protected int compareToImpl(Person p)
    {
        if(p instanceof HealthyPerson) {
            return this.getName().compareToIgnoreCase(p.getName());
        }
        else {
            return 0;
        }
    }
    
    public String toString() {
            return String.format("%s In for %s", super.toString(), reason);
    }

}
 