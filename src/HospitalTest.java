import org.junit.Assert;
import org.junit.Test;

public class HospitalTest
{

    @Test
    public void testStackHospital(){
        
        StackHospital<Animal> animalStack = new StackHospital<Animal>();
        
        Animal a = new Animal("Golden", 5);
        Animal b = new Animal("Bulldog", 6);
        Animal c = new Animal("Labrador", 7);
        
        animalStack.addPatient(a);
        animalStack.addPatient(b);
        animalStack.addPatient(c);
        
        Assert.assertEquals(a.toString()+b.toString()+c.toString(),animalStack.allPatientInfo() );
        Assert.assertEquals(c,animalStack.nextPatient());
        Assert.assertEquals(c,animalStack.treatNextPatient());
        Assert.assertEquals(2,animalStack.numPatients());
        Assert.assertEquals("StackHospital",animalStack.hospitalType());
        Assert.assertEquals("A "+animalStack.hospitalType()+"-type hospital with "+animalStack.numPatients()+" patients.",animalStack.toString());
        
      
    }
    
    @Test
    public void testQueueHospital(){
       
        QueueHospital<Person> personQueue = new QueueHospital<Person>();
        
        SickPerson a = new SickPerson("Ryan", 19, 4);
        HealthyPerson b = new HealthyPerson("Samson", 19, "CheckUp");
        
        personQueue.addPatient(a);
        personQueue.addPatient(b);
        
        Assert.assertEquals(a.toString()+b.toString(),personQueue.allPatientInfo() );
        Assert.assertEquals(a,personQueue.nextPatient());
        Assert.assertEquals(a,personQueue.treatNextPatient());
        Assert.assertEquals(1,personQueue.numPatients());
        Assert.assertEquals("QueueHospital",personQueue.hospitalType());
        
       
    
    }
    
    @Test
    public void testPriorityQueueHospital(){
        
        PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
        
        SickPerson a = new SickPerson("Ryan", 19, 4);
        SickPerson b = new SickPerson("Samson", 19, 7);
        SickPerson c = new SickPerson("Jack", 19, 9);
        
        personPQueue.addPatient(b);
        personPQueue.addPatient(a);
        personPQueue.addPatient(c);
        
        Assert.assertEquals(c.toString()+a.toString()+b.toString(),personPQueue.allPatientInfo() );
        Assert.assertEquals(c,personPQueue.nextPatient());
        Assert.assertEquals(c,personPQueue.treatNextPatient());
        Assert.assertEquals(2,personPQueue.numPatients());
        Assert.assertEquals("PriorityQueueHospital",personPQueue.hospitalType());
        
    }

}
