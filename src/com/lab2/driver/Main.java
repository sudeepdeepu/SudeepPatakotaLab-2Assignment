package com.lab2.driver;
import java.util.Scanner;

import com.lab2.services.Transactions;
import com.lab2.services.MergeSortImplementation;
import com.lab2.services.NotesCount;

public class Main {
	public static void main(String[] args) {
		MergeSortImplementation mergeSortImplementation = new MergeSortImplementation();
		NotesCount notesCount = new NotesCount();
		System.out.println("enter the size of currency dominations");
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] notes = new int[size];
		System.out.println("enter the currency dominations value");
		for(int i=0;i<size;i++) {
			notes[i]=s.nextInt();
		}
		System.out.println("enter the amount you hav to pay");
		int amount = s.nextInt();
		mergeSortImplementation.sort(notes,0,notes.length-1);
		notesCount.notesCountImplementation(notes,amount);
	}

}
