import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.util.Formatter;

import Model.Employee;

public class App {

    static ArrayList<Employee> list = new ArrayList<>();
    static JSONArray elist = new JSONArray();

    public static void convertJSONtoObjects() throws IOException, org.json.simple.parser.ParseException {
        // parsing a JSON file

        list.clear();
        elist.clear();
        try {
            FileReader reader = new FileReader("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
            JSONParser jsonParser = new JSONParser();
            JSONObject obj = (JSONObject) jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj.get("data");

            for (int i = 0; i < employeeList.size(); i++) {
                JSONObject emp = (JSONObject) employeeList.get(i);
                elist.add(emp);
                // if(emp.containsKey("firstName"))
                // String t = (String)emp.get("firstName").toString();
                String name = emp.get("FirstName").toString();
                String lname = emp.get("LastName").toString();
                String dob = emp.get("Dob").toString();
                ;
                String age = emp.get("Age").toString();
                JSONObject address = (JSONObject) emp.get("Address");

                String fline = address.get("FirstLine").toString();
                String sline = address.get("SecondLine").toString();
                String city = address.get("City").toString();
                String state = address.get("State").toString();
                String post = address.get("Post").toString();
                String pin = address.get("Pincode").toString();
                String country = address.get("Country").toString();

                String pno = emp.get("PhoneNumber").toString();
                String email = emp.get("email").toString();
                String oemail = emp.get("OfficialEmail").toString();
                String dep = emp.get("Department").toString();
                String doj = emp.get("doj").toString();
                String quali = emp.get("Qualification").toString();
                String aadhar = emp.get("AadharNo").toString();

                Employee t = new Employee(name, lname, dob, age, fline, sline, city, state, post, pin, country, pno,
                        email, oemail, dep, doj, quali, aadhar);
                list.add(t);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void addEmployee() {
        JSONParser jsonParser = new JSONParser();

        try {
            FileReader reader = new FileReader("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
            Object obj = jsonParser.parse(reader);

            Scanner ab = new Scanner(System.in);
            JSONObject n = new JSONObject();

            System.out.println("Enter FirstName");
            String name = ab.nextLine();
            n.put("FirstName", name);

            System.out.println("Enter LastName");
            String lname = ab.nextLine();
            n.put("LastName", lname);

            System.out.println("Enter Dob");
            String dob = ab.nextLine();
            n.put("Dob", dob);

            System.out.println("Enter Age");
            String age = ab.nextLine();
            n.put("Age", age);

            JSONObject address = new JSONObject();
            JSONObject addressInternal = new JSONObject();

            System.out.println("Enter FirstLine");
            String fline = ab.nextLine();
            addressInternal.put("FirstLine", fline);
            System.out.println("Enter SecondLine");
            String sline = ab.nextLine();
            addressInternal.put("SecondLine", sline);
            System.out.println("Enter City");
            String city = ab.nextLine();
            addressInternal.put("City", city);
            System.out.println("Enter State");
            String state = ab.nextLine();
            addressInternal.put("State", state);
            System.out.println("Enter Post");
            String post = ab.nextLine();
            addressInternal.put("Post", state);
            System.out.println("Enter Pincode");
            String pin = ab.nextLine();
            addressInternal.put("Pincode", pin);
            System.out.println("Enter Country");
            String country = ab.nextLine();
            addressInternal.put("Country", country);

            n.put("Address", addressInternal);

            System.out.println("Enter PhoneNumber");
            String pno = ab.nextLine();
            n.put("PhoneNumber", pno);
            System.out.println("Enter email");
            String email = ab.nextLine();
            n.put("email", email);
            System.out.println("Enter OfficialEmail");
            String oemail = ab.nextLine();
            n.put("OfficialEmail", oemail);
            System.out.println("Enter Department");
            String dep = ab.nextLine();
            n.put("Department", dep);
            System.out.println("Enter doj");
            String doj = ab.nextLine();
            n.put("doj", doj);
            System.out.println("Enter Qualification");
            String quali = ab.nextLine();
            n.put("Qualification", quali);
            System.out.println("Enter AadharNo");
            String aadhar = ab.nextLine();
            n.put("AadharNo", aadhar);

            elist.add(n);

            JSONObject employeeObj = new JSONObject();
            employeeObj.put("data", elist);

            System.out.println(n.toJSONString());

            FileWriter file = new FileWriter("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
            System.out.println(employeeObj.toJSONString());
            file.flush();
            file.write(employeeObj.toJSONString());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void printData() throws IOException, org.json.simple.parser.ParseException {

        convertJSONtoObjects();
        System.out.println("Name" + "\t\t" + "DOB" + "\t\t" + "Age" + "\t\t"
                + "Address" + "\t\t\t\t\t\t" + "Phone" + "\t\t" + "Email" + "\t\t" + "Official Email"
                + "\t" + "Qualification" + "\t" + "DOJ");

        for (int i = 0; i < list.size(); i++) {
            Employee t = list.get(i);
            System.out.println(t.getFirstName() + "\t" + t.getLastName() + "\t" + t.getDob() + "\t" + t.getAge() + "\t"
                    + t.getFirstLine() + t.getSecondLine() + t.getCity() + t.getState() + t.getPost() + t.getPincode()
                    + t.getCountry() + "\t" + t.getPhoneNumbers() + "\t" + t.getEmail() + "\t" + t.getOfficialEmail()
                    + "\t" + t.getQualification() + "\t" + t.getDepartment() + "\t" + t.getDoj());
        }

    }

    public static void editPhone() {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Aadhar");
        String aadhar = ab.nextLine();

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);

            if (e.getAadharNo().equals(aadhar)) {
                System.out.println("Please enter the new phone number");
                String ph = ab.nextLine();
                elist.remove(i);

                JSONParser jsonParser = new JSONParser();

                try {
                    FileReader reader = new FileReader("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
                    Object obj = jsonParser.parse(reader);
                    JSONObject n = new JSONObject();
                    n.put("FirstName", e.getFirstName());
                    n.put("LastName", e.getLastName());
                    n.put("Dob", e.getDob());
                    n.put("Age", e.getAge());

                    JSONObject address = new JSONObject();
                    JSONObject addressInternal = new JSONObject();
                    addressInternal.put("FirstLine", e.getFirstLine());
                    addressInternal.put("SecondLine", e.getSecondLine());
                    addressInternal.put("City", e.getCity());
                    addressInternal.put("State", e.getState());
                    addressInternal.put("Post", e.getPost());
                    addressInternal.put("Pincode", e.getPincode());
                    addressInternal.put("Country", e.getCountry());

                    n.put("Address", addressInternal);

                    n.put("PhoneNumber", ph);
                    n.put("email", e.getEmail());
                    n.put("OfficialEmail", e.getOfficialEmail());
                    n.put("Department", e.getDepartment());
                    n.put("doj", e.getDoj());
                    n.put("Qualification", e.getQualification());
                    n.put("AadharNo", e.getAadharNo());

                    elist.add(n);

                    JSONObject employeeObj = new JSONObject();
                    employeeObj.put("data", elist);

                    System.out.println(n.toJSONString());

                    FileWriter file = new FileWriter("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
                    System.out.println(employeeObj.toJSONString());
                    file.flush();
                    file.write(employeeObj.toJSONString());
                    file.close();
                    System.out.println("Edit Success");

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("Error Encountered");

                }

                return;
            }
        }
        System.out.println("Edit Unsuccessful");

    }

    public static void deleteEmployee() {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter Aadhar Number");
        String aadhar = ab.nextLine();

        for (int i = 0; i < list.size(); i++) {
            Employee e = list.get(i);

            if (e.getAadharNo().equals(aadhar)) {
                elist.remove(i);

                JSONParser jsonParser = new JSONParser();

                try {
                    FileReader reader = new FileReader("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
                    Object obj = jsonParser.parse(reader);
                    JSONObject employeeObj = new JSONObject();
                    employeeObj.put("data", elist);
                    FileWriter file = new FileWriter("C:/Users/gurke/Desktop/Java-JSON/src/employee.json");
                    System.out.println(employeeObj.toJSONString());
                    file.flush();
                    file.write(employeeObj.toJSONString());
                    file.close();
                    System.out.println("Delete Success");

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("Error Encountered");

                }

                return;
            }
        }
        System.out.println("Delete Unsuccessful");

    }

    public static void main(String args[]) throws IOException, ParseException, org.json.simple.parser.ParseException {

        convertJSONtoObjects();

        Scanner ab = new Scanner(System.in);
        System.out.println("Welcome to the Employee Database");

        System.out.println(
                "Enter 1 to view all employees\nEnter 2 to add new employee\nEnter 3 to edit the phone number of a employee\nEnter 4 to delete an employee by Aadhar Card Number\nEnter 5 to exit");

        while (true) {
            System.out.println("Enter your choice");
            int choice = ab.nextInt();
            if (choice == 1)
                printData();
            else if (choice == 2)
                addEmployee();
            else if (choice == 3)
                editPhone();
            else if (choice == 4)
                deleteEmployee();
            else
                break;
        }
    }
}
