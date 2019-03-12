import java.util.Stack;

public class StackHospital <PatientType> extends Hospital <PatientType>
{

    private Stack<PatientType> stack;
    
    public StackHospital() {
        stack = new Stack<PatientType>();
    }

    @Override
    public void addPatient(PatientType patient)
    {
       stack.add(patient);
    }

    @Override
    public PatientType nextPatient()
    {
        return (PatientType) stack.peek();
    }

    @Override
    public PatientType treatNextPatient()
    {
        stack.pop();
        return stack.peek();
    }

    @Override
    public int numPatients()
    {
       return stack.size();
    }

    @Override
    public String hospitalType()
    {
        return "Stack Hospital";
    }

    @Override
    public String allPatientInfo()
    {
       return stack.toString();
    }
}
