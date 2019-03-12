import java.util.PriorityQueue;

public class PriorityQueueHospital <PatientType> extends Hospital<PatientType>
{
    private PriorityQueue<PatientType>  PQueue;

    public PriorityQueueHospital () {
        PQueue = new PriorityQueue<>();
    }

    @Override
    public void addPatient(PatientType patient)
    {
        PQueue.add(patient);
    }

    @Override
    public PatientType nextPatient()
    {
        return PQueue.peek();
    }

    @Override
    public PatientType treatNextPatient()
    {
        return PQueue.poll();
    }

    @Override
    public int numPatients()
    {
       return PQueue.size();
    }

    @Override
    public String allPatientInfo()
    {
        return PQueue.toString();
    }
    
    @Override
    public String hospitalType()
    {
        return "PriorityQueueHospital";
    }

}
