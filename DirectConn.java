import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DirectConn {
    
    // takes location and population parameters and prints the amount of cable needed
public void calConnections(ArrayList<Long> location,ArrayList<Long> pop,int cities)
        {
            ArrayList<Long> totalDistance = new ArrayList<Long>();
    
            for(int i=0;i<cities;i++)
                {
                    for(int j=i+1;j<cities;j++)
                        {
                            long noOfCables = Math.max(pop.get(i),pop.get(j));
                            long distance = Math.abs(location.get(i)-location.get(j));
                            totalDistance.add(noOfCables*distance);
                        }
                }
            long sum = 0;
            for(int k=0;k<totalDistance.size();k++)
            {
                sum = sum + totalDistance.get(k);
            }    
    
            System.out.println(sum%1000000007);
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named DirectConn. */
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Long> coordinates = new ArrayList<Long>();
        ArrayList<Long> population = new ArrayList<Long>();
        ArrayList<Integer> citiesInEachScene = new ArrayList<Integer>();
        
        int scenario = scan.nextInt();
        for(int i=0;i<scenario;i++)
            {
                int noOfCities = scan.nextInt();
                citiesInEachScene.add(noOfCities);
            // store co ordinates   
                for(int j=0;j<noOfCities;j++)
                    {
                        
                    long store = scan.nextLong();
                        coordinates.add(store);
                    }
                for(int j=0;j<noOfCities;j++)
                    {
                        long store = scan.nextLong();
                        population.add(store);
                    }
            }
            DirectConn s = new DirectConn();
            int cities = 0;     
        for(int i=0;i<scenario;i++)
                {
                ArrayList<Long> temp1 = new ArrayList<Long>();
                ArrayList<Long> temp2 = new ArrayList<Long>();
                   
                
                        {
                            
                            for(int k=0;k<citiesInEachScene.get(i);k++)
                                {
                               temp1.add(coordinates.get((cities)+k));
                               temp2.add(population.get((cities)+k));
                                 
                                }
                                                                                            
                             cities += citiesInEachScene.get(i);
                            s.calConnections(temp1,temp2,citiesInEachScene.get(i));
                            temp1.clear();
                            temp2.clear();
                        }
                
                }
         
        
    }
}