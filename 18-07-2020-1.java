import java.util.ArrayList; 
import java.util.Iterator; 
class ArrayList1
{  
public static void main(String args[])
{  
ArrayList<String> list=new ArrayList<String>();  
list.add("mango"); 
list.add("banana");  
list.add("watermellon");  
list.add("apple");   
Iterator itr=list.iterator();  
while(itr.hasNext())
{  
System.out.println(itr.next());  
}  
}  
}  