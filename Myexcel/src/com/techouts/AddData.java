package com.techouts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
class A{
	int a;
	String b;
	public A(){
		
	}
	public A(int a, String b) {
		 
		this.a = a;
		this.b = b;
	}
	
	public void addQ() throws IOException{
		 	String s="";
		A a1=new A(1,"knr");
		A a2=new A(2,"kaku");
		A a3=new A(3,"manu");
		A a4=new A(3,"manu123");
		List l=new ArrayList();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
File f=new File("D:\\exceldata.xls");
FileOutputStream fos = null;
try {
	fos = new FileOutputStream(f);
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 Iterator i=l.iterator();
 while(i.hasNext()){
	 A a=(A)i.next();
	 s=s+a.a+"\t";
	 s=s+a.b+"\n";
	 
 }
byte[] ch=s.getBytes();
 fos.write(ch);
 fos.flush();
  
	}
	public void takeExam() throws IOException{
		Scanner sc=new Scanner(System.in);
		FileInputStream fis=new FileInputStream("D:\\exceldata.xls");
		int count=-1;
		List l=new ArrayList();
		StringBuilder s=new StringBuilder();
		s=s.append("");
		int comma=0;
		int news=0;
		int ch=0;
		String an=sc.next();
		while((ch=fis.read())!=-1){
			 
			if((char)ch=='\t'){
				comma++;
			}
			if((char)ch=='\n'){
				news++;
			}
			if(comma==1&&news==0){
				s=s.append((char)ch);
			}
		}
		
		if(s.equals("\t"+an)){
			System.out.println("correct");
		}else{
			System.out.println("no");
		}
		
	}
}
public class AddData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	/*	String s="";
		A a1=new A(1,"knr");
		A a2=new A(2,"kaku");
		A a3=new A(3,"manu");
		A a4=new A(3,"manu123");
		List l=new ArrayList();
		l.add(a1);
		l.add(a2);
		l.add(a3);
		l.add(a4);
File f=new File("D:\\exceldata.xls");
FileOutputStream fos=new FileOutputStream(f);
 Iterator i=l.iterator();
 while(i.hasNext()){
	 A a=(A)i.next();
	 s=s+a.a+"\t";
	 s=s+a.b+"\n";
	 
 }
byte[] ch=s.getBytes();
 fos.write(ch);
 fos.flush();
 */
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your role");
		int no=sc.nextInt();
		if(no==2){
			new A().takeExam();
		}
		if(no==1){
			new A().addQ();
		}
		
   
	}

}
