package com.lab2.services;

import java.util.Scanner;

public class Transactions {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the values of array");
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
			System.out.println("Enter the total number of targets that need to be achieved");
			int targetNo=s.nextInt();
			while(targetNo--!=0) {
				int flag =0;
				long target;
				System.out.println("Enter the value of target");
				target=s.nextInt();
				long sum = 0;
				for(int j=0;j<size;j++) {
					sum+=arr[j];
					if(sum>=target) {
						System.out.println("Target achieved after "+(j+1)+" transactions");
						flag=1;
						break;
					}
				}
					
					if(flag==0) {
						System.out.println("Given target is not achieved");
					}
				}
				
			}
		}
	


