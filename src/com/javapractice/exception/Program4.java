package com.javapractice.exception;
import java.util.Comparator;
import java.util.PriorityQueue;
class Person implements Comparable
{
 String name;
 int age;
 double cost;
 public Person(String name, int age, double cost)
 {
  this.name = name;
  this.age = age;
  this.cost = cost;
 }
 public String toString()
 {
  return "Vaccine [name=" + name + ", age=" + age + ", cost=" + cost + "]";
 }
 public int compareTo(Object o)
 {
  Person pt=(Person)o;
  return pt.age-this.age;
 }
}
class SortOnCost implements Comparator
{
 public int compare(Object o1, Object o2)
 {
  Person pt1=(Person)o1;
  Person pt2=(Person)o2;
  return (int)(pt2.cost-pt1.cost);
 }
}
class SortOnName implements Comparator
{
 public int compare(Object o1, Object o2)
 {
  Person pt1=(Person)o1;
  Person pt2=(Person)o2;
  String first=pt1.name;
  String second=pt2.name;
  int value=first.compareTo(second);
  return value;
 }
}
public class Program4
{
public static void main(String[] args)
{
 Person p1=new Person("jhon",56,750);
 Person p2=new Person("mark",25,1200);
 Person p3=new Person("ram",34,460);
 Person p4=new Person("som",67,1500);
 Person p5=new Person("sam",44,369);
 PriorityQueue pq=new PriorityQueue();
 pq.add(p1);
 pq.add(p2);
 pq.add(p3);
 pq.add(p4);
 pq.add(p5);
 int len=pq.size();
 System.out.println("first priority queue");
 for (int i = 0; i < len; i++)
 {
  Object ob= pq.poll();
  System.out.println(ob);
 }
PriorityQueue pq2=new PriorityQueue(new SortOnCost());
 pq2.add(p1);
 pq2.add(p2);
 pq2.add(p3);
 pq2.add(p4);
 pq2.add(p5);
 int len2=pq2.size();
 System.out.println("second priority queue");
 for (int i = 0; i < len2; i++)
 {
  Object ob= pq2.poll();
  System.out.println(ob);
 }
PriorityQueue pq3=new PriorityQueue(new SortOnName());
 pq3.add(p1);
 pq3.add(p2);
 pq3.add(p3);
 pq3.add(p4);
 pq3.add(p5);
 int len3=pq3.size();
 System.out.println("third priority queue");
 for (int i = 0; i < len3; i++)
 {
  Object ob= pq3.poll();
  System.out.println(ob);
 }
}
}
