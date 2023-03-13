package my;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class ArrayListExample2 {

	public static void main(String[] args) {
		//object creation
		ArrayList<String> preList=new ArrayList<>();
		preList.add("Black");
		preList.add("white");
		
		ArrayList<String>colorList=new ArrayList<>();
		//Adding color names
		colorList.add("Violet");
		colorList.add("Indigo");
		colorList.add("Blue");
		colorList.add("Green");
		colorList.add("Yellow");
		colorList.add(0,"Grey");//Overloading method
		//To traverse the list
		colorList.addAll(preList);
		System.out.println(colorList);
		System.out.println(colorList.isEmpty());
		colorList.remove(0);
		//System.out.println(colorList.contains("Grey"));
	    int pos=5;
		String value = colorList.get(pos);
		System.out.println(value);
		if(colorList.contains("Blue"))
		{
			colorList.remove("Black");
			System.out.println(colorList);
		}
		else{
			System.out.println("Color not found in our list");
		}
		int index = colorList.indexOf("Black");
		System.out.println(index);

		Iterator<String>itr=colorList.iterator();
		
		System.out.println(itr.next());//Iterator iterates in single direction forward direction
		colorList.clear();
		System.out.println(colorList);
		boolean b=colorList.containsAll(preList);
		System.out.println(b);
		System.out.println(colorList.equals(preList));
		
	}

}
