import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import Model.Employee;

public class App {

    static ArrayList<Employee> list = new ArrayList<>();

    public static void convertJSONtoObjects() throws IOException, org.json.simple.parser.ParseException {
        // parsing a JSON file

        list.clear();
        try {
            FileReader reader = new FileReader("employee.json");
            JSONParser jsonParser = new JSONParser();
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            // Iterate over employee array
            for (int i = 0; i < employeeList.size(); i++) {
                // Get employee object within list
                JSONObject employeeObject = (JSONObject) employeeList.get(i);

                // Get employee first name
                String firstName = (String) employeeObject.get("firstName");
                System.out.println(firstName);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void printData() {
        for (int i = 0; i < list.size(); i++) {
            Employee t = list.get(i);
            System.out.println(t.getFirstName());
        }
    }

    public static void main(String args[]) throws IOException {

        convertJSONtoObjects();

        Scanner ab = new Scanner(System.in);
        System.out.println("Welcome to the Employee Database");

        System.out.println(
                "Enter 1 to view all employees\nEnter 2 to add new employee\nEnter 3 to search for a employee\nEnter 4 to edit the phone number of a employee\nEnter 5 to delete an employee by Aadhar Card Number\nEnter 6 to exit");

        while (true) {
            System.out.println("Enter your choice");
            int choice = ab.nextInt();
            if (choice == 1)
                printData();
            // else if (choice == 2)
            // addStudent();
            // else if (choice == 3)
            // search();
            // else if (choice == 4)
            // editStudentPhoneNumber();
            else
                break;
        }
    }
}
