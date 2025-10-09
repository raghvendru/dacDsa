package Practise;
import java.io.*;
import java.util.*;
public class gen {
	
	    public static void main(String[] args) {
	        String fileName = "selected_numbers.txt";
	        File file = new File(fileName);

	        try {
	            // Step 1: Create file if not exists
	            if (!file.exists()) {
	                file.createNewFile();
	                System.out.println("File created: " + fileName);
	            } else {
	                System.out.println("File already exists.");
	            }

	            // Step 2: Read existing numbers
	            Set<Integer> existingNumbers = new HashSet<>();
	            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	                String line;
	                while ((line = br.readLine()) != null) {
	                    line = line.trim();
	                    if (!line.isEmpty()) {
	                        existingNumbers.add(Integer.parseInt(line));
	                    }
	                }
	            }

	            // Step 3: Generate random number
	            Random rand = new Random();
	            int randomNumber = rand.nextInt(196) + 1;  // Range 1–196

	            // Step 4: Check if random number already present
	            if (existingNumbers.contains(randomNumber)) {
	                System.out.println("Number " + randomNumber + " already got a chance.");
	            } else {
	                // Step 5: Write the new number to file
	                try (FileWriter fw = new FileWriter(file, true)) {
	                    fw.write(randomNumber + "\n");
	                }
	                System.out.println("New random number: " + randomNumber);
	            }

	            // Step 6: Display file content
	            System.out.println("\n📄 Numbers in file:");
	            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
	                String line;
	                while ((line = br.readLine()) != null) {
	                    System.out.println(line);
	                }
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}


