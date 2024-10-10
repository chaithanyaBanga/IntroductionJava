package CoreJava;
import java.util.ArrayList;

// dynamically growing data 
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("hi");
		a.add("hello");
		a.add("hiii");
		a.remove(2);
		a.get(1); // extract the value means get te value present in the fourth index
		System.out.println(a.get(0));
	



// to print the value of array value need to use iteration 

//for (i=0; i< size.a; i++)
//{
	//System.out.println(a.get(i));
	
//}

// in enhanced for loop

for (String val: a)
{
	System.out.println(val);
	
}



//item is presnt in array or not

System.out.println(a.contains("hello")); // result will be true or false

}
}