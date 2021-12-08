package excercise;

import java.util.Comparator;
import java.util.PriorityQueue;

class Adult implements Comparable
{
	String name;
	int age;
	Adult(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public String toString()
	{
		return "Vaccine [name="+name+",age="+age+"]";
	}
	@Override
	public int compareTo(Object o) {
		Adult a=(Adult)o;
		String first=a.name;
		String second=a.name;
		return first.compareTo(second);
	}
	
}
class sortAge implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Adult at1=(Adult)o1;
		Adult at2=(Adult)o2;
		return at1.age-at2.age;
	}
	
}
public class Priority {
public static void main(String[] args) {
	Adult ad1=new Adult("harish",52);
	Adult ad2=new Adult("manish",32);
	Adult ad3=new Adult("sannu",85);
	Adult ad4=new Adult("kaarthik",49);
	PriorityQueue pq1=new PriorityQueue();
	pq1.add(ad1);
	pq1.add(ad2);
	pq1.add(ad3);
	pq1.add(ad4);
	int len=pq1.size();
	System.out.println(pq1.size());
	for(int i=0;i<len;i++)
	{
		Object ob=pq1.poll();
		System.out.println(ob);
	}
	System.out.println(pq1.size());
	PriorityQueue pq2=new PriorityQueue();
	pq2.add(ad1);
	pq2.add(ad2);
	pq2.add(ad3);
	pq2.add(ad4);
	int len1=pq2.size();
	System.out.println(pq2.size());
	for(int i=0;i<len1;i++)
	{
		Object ob=pq2.poll();
		System.out.println(ob);
	}
	System.out.println(pq2.size());
	
}
}
