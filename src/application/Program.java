package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Color;
import entities.Rectangle;
import entities.Circle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc=new Scanner(System.in);
		
		List<Shape> list=new ArrayList<>();
		
		System.out.println("enter the number of shapes: ");
		int number=sc.nextInt();
		
		for (int i=0;i<number;i++) {
			System.out.printf("shape #%d data: ",i+1);
			System.out.println("rectangle or circle (r/c)? ");
			char type=sc.next().charAt(0);
			
			System.out.println("color (BLACK/BLUE/RED): ");
			Color color=Color.valueOf(sc.next());
			
			if (type=='r') {
				System.out.println("width: ");
				double width=sc.nextDouble(); 
				
				System.out.println("height: ");
				double height=sc.nextDouble();
				
				list.add(new Rectangle(color, width, height));
			}
			else if (type=='c') {
				System.out.println("radius: ");
				double radius=sc.nextDouble();
				
				list.add(new Circle(color,radius));
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		
		for (Shape shape : list) {
			System.out.printf("%.2f", shape.area());
		}
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
