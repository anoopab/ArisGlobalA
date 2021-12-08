package java8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Person{
	public Person(int age, String firstName, String lastName) {
		super();
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
		public String toString() {
		return "Person[age=" + age +",firstName="+ firstName + ",lastName=" +lastName+ "]";
			}
		public int getAge() {
			return age;}
		
		public void setAge(int age) {
			this.age=age;}
		
		public String getfirstName() {
			return firstName ;
		}
		public void setfirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName ;
		}
		public void setLastName(String LastName) {
			this.lastName = lastName;
		}
		private int age;
		private String firstName;
		private String lastName;

	
public class Assignment1{
	public static void main(String[] args) {
	
		Person ajay=new Person(25,"ajay","kumar");
		Person sham=new Person(25,"sham","p");
		Person kiran=new Person(25,"kiran","jay");
		Person priya=new Person(25,"priya","s");
		
		List<Person>ls=new ArrayList<Person>();
		ls.add(ajay);
		ls.add(sham);
		ls.add(kiran);
		ls.add(priya);
		
		Collections.sort(ls,new Comparator<Person>() 
		{
public int compare(Person p1, Person p2) {
	return p1.getLastName().compareTo(p2.getLastName());
}}
		
 
);
		System.out.println(ls);
		for(Person p:ls)
		{
			if(p.getLastName().startsWith("A")) {
		
			System.out.println(p);
		}}
		ls.forEach(p->p.getLastName().startsWith("A"));
			}}}
