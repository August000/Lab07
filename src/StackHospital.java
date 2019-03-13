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
        return stack.pop();
    }

    @Override
    public int numPatients()
    {
       return stack.size();
    }

    @Override
    public String hospitalType()
    {
        return "StackHospital";
    }

    @Override
    public String allPatientInfo()
    {
        String output = "";
      
        for(PatientType p: stack) {
            output += p.toString();
        }
        System.out.println(output);
        return output;
    }
}
