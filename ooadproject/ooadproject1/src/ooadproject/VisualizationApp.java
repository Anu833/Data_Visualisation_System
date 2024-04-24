package ooadproject;

import java.util.*;

public class VisualizationApp {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		Dataset dt1 = new Dataset();
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the file path to your dataset: ");
//		String file_path = sc.nextLine();
		
		//String file_path = "C:\\Users\\ashro\\Downloads\\Social_Network_Ads_twocol.csv";
		
		String file_path = "/Users/anushkaprashantpatil/eclipse-workspace/mtcars.csv";
		
		dt1.loadFromCSV(file_path);
		
		int flag = 1;
		int choice;
		do
		{
			System.out.println("Choose the plot: \n 1. Pie Chart \n 2. Bar Chart \n 3. Line Chart \n 4. Bubble Chart \n 5. Display Dataset\nEnter your choice: ");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					VisualizationFactory factory1 = new VisualizationFactory1();
			        Visualization plot1 = factory1.factoryMethod();
			        plot1.display(dt1);
					break;
				case 2:
					VisualizationFactory factory2 = new VisualizationFactory2();
			        Visualization plot2 = factory2.factoryMethod();
			        plot2.display(dt1);
					break;
				case 3:
					VisualizationFactory factory3 = new VisualizationFactory3();
			        Visualization plot3 = factory3.factoryMethod();
			        plot3.display(dt1);
					break;
				case 4:
					VisualizationFactory factory4 = new VisualizationFactory4();
			        Visualization plot4 = factory4.factoryMethod();
			        plot4.display(dt1);
					break;
				case 5:
					dt1.displayDataset();
					break;
				default:
					System.out.println("Invalid option");
			}
			System.out.println("Choose one of the following: \n 1. Go back to main menu \n 2. Exit \nEnter your choice: ");
			flag = sc.nextInt();
		}while(flag==1);
		System.out.println("Goodbye!");
	}
}
