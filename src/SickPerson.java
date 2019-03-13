
public class SickPerson extends Person
{
    private int severity;
    
    public SickPerson(String name, int age, int severity){
        super(name, age);
        this.severity = severity;
    }

    protected int getSeverity(){
        return severity;
    }
    
    protected int compareToImpl(Person p){
       
       if(p instanceof SickPerson) {
           if(this.severity > ((SickPerson) p).getSeverity() ) {
               return -1;
           }
           else if(this.severity < ((SickPerson) p).getSeverity()) {
               return 1;
           }
           else {
               return 0;
           }
       }
       else {
           return 0;
       }
    }

    @Override
    public String toString() {
        return String.format("%s Severity level %d", super.toString(), this.severity);
    }
    
    
}
