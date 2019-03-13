import org.junit.Assert;
import org.junit.Test;

public class PersonTest
{

    @Test
    public void SickPersonTest() {
        
        SickPerson p1 = new SickPerson("Eddie",47,9);
        SickPerson p2 = new SickPerson("Ryan",20,6);
        HealthyPerson p3 = new HealthyPerson("Ryan",45,"Back Pain");
        
        Assert.assertEquals("Eddie",  p1.getName());
        Assert.assertEquals(47 ,  p1.getAge());
        Assert.assertEquals(9,  p1.getSeverity());
        
        Assert.assertEquals(-1,  p1.compareTo(p2));
        Assert.assertEquals(1,  p2.compareTo(p1));
        Assert.assertEquals(0,  p1.compareTo(p1));
        
        Assert.assertEquals(0,  p1.compareTo(p3));
   
    }
    
    @Test
    public void HealthyPersonTest(){
        
        HealthyPerson p1 = new HealthyPerson("Betty",45, "Back pain");
        SickPerson p2 = new SickPerson("Ryan",20,6);
        
        Assert.assertEquals("Betty",  p1.getName());
        Assert.assertEquals( 45 ,  p1.getAge());
        Assert.assertEquals("Back pain",  p1.getReason());
        
        Assert.assertEquals(0,  p1.compareTo(p1));
        Assert.assertEquals(0,  p1.compareTo(p2));
    }
    
    @Test
    public void AnimalTest(){
        
        Animal a = new Animal("Golden", 6);
        
        Assert.assertEquals(0,  a.compareTo(a));
      
    }
    
}
