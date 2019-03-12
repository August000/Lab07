import java.util.LinkedList; 
import java.util.Queue;

public class QueueHospital <PatientType> extends Hospital <PatientType>{

    private Queue<PatientType> queue;
    
    public QueueHospital (){
        queue = new LinkedList<>(); 
    }
    
    @Override
    public void addPatient (PatientType patient) {
        queue.add(patient);
    }
    
    public PatientType nextPatient() {
        return queue.peek();
    }
    
    public PatientType treatNextPatient() {
        return queue.poll();
    }
            
    public int numPatients() {
        return queue.size();
    }
    
    public String allPatientInfo() {
       
        return queue.toString();
    }
    
    public String hospitalType()
    {
        return "QueueHospital";
    }
    
}
