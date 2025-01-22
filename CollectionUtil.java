package com.collection_util;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionUtil<T> {
	public  <T> Collection<T> chooseCollectionType() {
		Collection<T> c=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ArrayList");
		System.out.println("2.LinkedList");
		System.out.println("3.Vector");
		System.out.println("4.PriorityQueue");
		System.out.println("5.ArrayDeque");
		System.out.println("6.HashSet");
		System.out.println("7.LinkedHashSet");
		System.out.println("8.TreeSet");
		System.out.println("Select one option: ");
		int option=sc.nextInt();
		switch(option) {
		case 1:
			c=new ArrayList<T>();
			break;
		case 2:
			c=new LinkedList<T>();
			break;
		case 3:
			c=new Vector<T>();
			break;
		case 4:
			c=new PriorityQueue<T>();
			break;
		case 5:
			c=new ArrayDeque<T>();
			break;
		case 6:
			c=new HashSet<T>();
			break;
		case 7:
			c=new LinkedHashSet<T>();
			break;
		case 8:
			c=new TreeSet<T>();
			break;
		}
		return c;
	}
	public int chooseOperation() {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Add an element");
		System.out.println("2.remove an element");
		System.out.println("3.Display all elements");
		System.out.println("4.Return  number of elements");
		System.out.println("5.Check Collection is empty or not");
		System.out.println("6.Search an Element");
		System.out.println("7.clear");
		System.out.println("8.ToArray");
		System.out.println("Select one operation: ");
		int operation=sc.nextInt();
		return operation;
	}

}
