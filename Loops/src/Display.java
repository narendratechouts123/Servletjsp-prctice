import java.util.ArrayList;
import java.util.List;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"nn");
		Student s2=new Student(2,"nn");
		Student s3=new Student(1,"nn");
		List<Student> l=new ArrayList();
		l.add(s1);		l.add(s2);
		l.add(s3);
            
               
               
l.stream().filter(x->x.no==1).forEach(s-> {
	 
	System.out.println(s.name+" "+s.no);
	
	
});
 
	}
	

}
