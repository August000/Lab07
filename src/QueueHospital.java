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
    
    @Override
    public PatientType nextPatient() {
        return queue.peek();
    }
    
    @Override
    public PatientType treatNextPatient() {
        return queue.poll();
    }
     
    @Override
    public int numPatients() {
        return queue.size();
    }
    
    @Override
    public String allPatientInfo() {
       
        String output = "";
        for(PatientType p: queue) {
            output += p.toString();
        }
        
        return output;
    }
    
    @Override
    public String hospitalType()
    {
        return "QueueHospital";
    }
    
}
