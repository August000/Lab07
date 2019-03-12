
public class HealthyPerson extends Person
{

    private String reason;
    
    public HealthyPerson(String name, int age, String reason)
    {
        super(name, age);
        this.reason = reason;
    }

    @Override
    protected int compareToImpl(Person p)
    {
        if(this.getName().compareTo(p.getName()) > 0) {
            return 1;
        }
        else if (this.getName().compareTo(p.getName()) < 0) {
            return -1;
        }
        else {
            return 0;
        } 
    }
    
    public String toString() {
            return String.format("%s, a %d-year old. Visit reason: %s", this.getName(), this.getAge(), reason);
    }

}
 