package com.collection_util;

import java.util.Collection;
import java.util.Scanner;

public class CollectionMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select type of data: ");
		System.out.println("1.Integer Type");
		System.out.println("2.Double Type");
		System.out.println("3.Character Type");
		System.out.println("4.String Type");
		int type=sc.nextInt();
		switch(type) {
		case 1:
			CollectionUtil<Integer> c=new CollectionUtil<Integer>();
			Collection<Integer> c1=c.chooseCollectionType();
			while(true) {
			int operation=c.chooseOperation();
				switch(operation) {
				case 1:
					System.out.println("How many elements you want to add: ");
					int num=sc.nextInt();
					for(int i=0;i<num;i++) {
						System.out.println("Enter the "+i+" th Integer element :");
						c1.add(sc.nextInt());
					}
					System.out.println("Elements added Successfully....");
					break;
				case 2:
					System.out.println("Enter the element you want to remove: ");
					c1.remove(sc.nextInt());
					System.out.println("Removed Successfully...");
					break;
				case 3:
					System.out.println(c1);
					break;
				case 4:
					System.out.println(c1.size());
					break;
				case 5:
					if(!c1.isEmpty()) {
						System.out.println("Elements are present..");
					}
					else {
						System.out.println("Elements are not present...");
					}
					break;
				case 6:
					System.out.println("Enter the element to be search: ");
					if(c1.contains(sc.nextInt())) {
						System.out.println("Element is Present..");
					}
					else {
						System.out.println("Element  is not present...");
					}
					break;
				case 7:
					c1.clear();
					System.out.println("Elements are Cleared Successfully...");
					break;
				case 8:
					System.out.println(c1.toArray());
					System.out.println("Print the array elements...");
					for(Integer i:c1) {
						System.out.println(i);
					}
					break;
				}
				System.out.println("Do you want to contine..y/n: ");
				char ch=sc.next().charAt(0);
				if(ch!='y') {
					break;
				}
			}
			break;
		case 2:
			CollectionUtil<Double> d=new CollectionUtil<Double>();
			Collection<Double> d1=d.chooseCollectionType();
			while(true) {
				int operation=d.chooseOperation();
					switch(operation) {
					case 1:
						System.out.println("How many elements you want to add: ");
						int num=sc.nextInt();
						for(int i=0;i<num;i++) {
							System.out.println("Enter the "+i+" th Double element :");
							d1.add(sc.nextDouble());
						}
						System.out.println("Elements added Successfully....");
						break;
					case 2:
						System.out.println("Enter the element you want to remove: ");
						d1.remove(sc.nextDouble());
						System.out.println("Removed Successfully...");
						break;
					case 3:
						System.out.println(d1);
						break;
					case 4:
						System.out.println(d1.size());
						break;
					case 5:
						if(!d1.isEmpty()) {
							System.out.println("Elements are present..");
						}
						else {
							System.out.println("Elements are not present...");
						}
						break;
					case 6:
						System.out.println("Enter the element to be search: ");
						if(d1.contains(sc.nextDouble())) {
							System.out.println("Element is Present..");
						}
						else {
							System.out.println("Element  is not present...");
						}
						break;
					case 7:
						d1.clear();
						System.out.println("Elements are Cleared Successfully...");
						break;
					case 8:
						d1.toArray();
						System.out.println("Print the array elements...");
						for(Double i:d1) {
							System.out.println(i);
						}
						break;
					}
					System.out.println("Do you want to contine..y/n: ");
					char ch=sc.next().charAt(0);
					if(ch!='y') {
						break;
					}
				}
			break;
		case 3:
			CollectionUtil<Character> ch=new CollectionUtil<Character>();
			Collection<Character> ch1=ch.chooseCollectionType();
			while(true) {
				int operation=ch.chooseOperation();
					switch(operation) {
					case 1:
						System.out.println("How many elements you want to add: ");
						int num=sc.nextInt();
						for(int i=0;i<num;i++) {
							System.out.println("Enter the "+i+" th Character element :");
							ch1.add(sc.next().charAt(0));
						}
						System.out.println("Elements added Successfully....");
						break;
					case 2:
						System.out.println("Enter the character element you want to remove: ");
						ch1.remove(sc.next().charAt(0));
						System.out.println("Removed Successfully...");
						break;
					case 3:
						System.out.println(ch1);
						break;
					case 4:
						System.out.println(ch1.size());
						break;
					case 5:
						if(!ch1.isEmpty()) {
							System.out.println("Elements are present..");
						}
						else {
							System.out.println("Elements are not present...");
						}
						break;
					case 6:
						System.out.println("Enter the character element to be search: ");
						if(ch1.contains(sc.next().charAt(0))) {
							System.out.println("Element is Present..");
						}
						else {
							System.out.println("Element  is not present...");
						}
						break;
					case 7:
						ch1.clear();
						System.out.println("Elements are Cleared Successfully...");
						break;
					case 8:
						ch1.toArray();
						System.out.println("Print the array elements...");
						for(Character i:ch1) {
							System.out.println(i);
						}
						break;
					}
					System.out.println("Do you want to contine..y/n: ");
					char chr=sc.next().charAt(0);
					if(chr!='y') {
						break;
					}
				}
			break;
		case 4:
			CollectionUtil<String> s=new CollectionUtil<String>();
			Collection<String> s1=s.chooseCollectionType();
			while(true) {
				int operation=s.chooseOperation();
					switch(operation) {
					case 1:
						System.out.println("How many elements you want to add: ");
						int num=sc.nextInt();
						sc.nextLine();
						for(int i=0;i<num;i++) {
							System.out.println("Enter the "+i+" th String element :");
							s1.add(sc.nextLine());
						}
						System.out.println("Elements added Successfully....");
						break;
					case 2:
						System.out.println("Enter the String you want to remove: ");
						s1.remove(sc.nextLine());
						System.out.println("Removed Successfully...");
						break;
					case 3:
						System.out.println(s1);
						break;
					case 4:
						System.out.println(s1.size());
						break;
					case 5:
						if(!s1.isEmpty()) {
							System.out.println("Elements are present..");
						}
						else {
							System.out.println("Elements are not present...");
						}
						break;
					case 6:
						System.out.println("Enter the String to be search: ");
						if(s1.contains(sc.nextLine())) {
							System.out.println("Element is Present..");
						}
						else {
							System.out.println("Element  is not present...");
						}
						break;
					case 7:
						s1.clear();
						System.out.println("Elements are Cleared Successfully...");
						break;
					case 8:
						s1.toArray();
						System.out.println("Print the array elements...");
						for(String i:s1) {
							System.out.println(i);
						}
						break;
					}
					System.out.println("Do you want to contine..y/n: ");
					char choose=sc.next().charAt(0);
					if(choose!='y') {
						break;
					}
				}
			break;
		default:
			System.out.println("Select correct type....");
			break;
		}
		sc.close();
	}
}