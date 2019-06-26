package com.selenium.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadCSV {

	public static void main(String[] args) {
		
        System.out.println("Read_CSV_File");
        
        String csvFile = "resources//country1.csv";
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] country = line.split(cvsSplitBy);
                System.out.println(Arrays.toString(country));
                
                System.out.println(country[4]+"\t"+country[5]);
                
                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}



