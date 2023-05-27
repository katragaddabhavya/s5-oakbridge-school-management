package com.jap.marksevaluation;
public class OakBridgeSchool {

    // Convert the given string name to upper case
    public String convertToUpperCase(String name){
       if(name.length()==0) {
           return " ";
       }
       String uppername=name.toUpperCase();
       return uppername;
    }

    // Find the shortest word in the list of surnames
    public String shortestSurname(String[] surnames)
    {
        String shortsurname;
        shortsurname=surnames[0];
        for(int i=0;i<surnames.length;i++){
            if(surnames[i].length()<shortsurname.length()){
                shortsurname=surnames[i];
            }
        }
        return shortsurname;
    }

    // Check if any of the names in the array is repeated, if yes return true else false
    public boolean checkIfNamesAreRepeated(String[] names){
        boolean flag = false;
        if(names.length==0){
            return true;
        }
        for(int i=0;i<names.length;i++){
            for(int j=i+1;i<names.length;i++){
                if(names[j].equals(names[i])){
                    flag=true;
                }
            }
        }

        return flag;
    }

    // Concatenate the name and surname of the students
    public String[] concatenateNameAndSurname(String[] names, String [] surnames){
        String[] concatenatedNames= new String[names.length];
        for(int i=0;i< names.length;i++){
            concatenatedNames[i]=names[i].concat("").concat(surnames[i]);
        }

        return  concatenatedNames;
    }

    // Display the names
    public void displayStudentNames(String[] namesArray){
        for(int i=0;i<namesArray.length;i++){
            System.out.print(namesArray[i] + " ,");
        }


    }

    public static void main(String[] args) {
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();
        // Declare and Initialize values to the arrays
        String[] studentNames = {"Michelle", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Kate", "Leo"};
        String[] studentSurnames = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Martin", "Clark", "King"};
        System.out.println("the student names is UPPERCASE");
        for(int i=0;i<studentNames.length;i++){
            System.out.println(oakBridgeSchool.convertToUpperCase(studentNames[i])+" ,");
        }
        String shortsurname=oakBridgeSchool.shortestSurname(studentSurnames);
        System.out.println("the shortest surname" +shortsurname);
        String Fullname[]=oakBridgeSchool.concatenateNameAndSurname(studentNames,studentSurnames);
        boolean flag= oakBridgeSchool.checkIfNamesAreRepeated(studentNames);
        System.out.println("the student name repeated" +flag);
        // Call the method to convert all the student names to upper case and display results

        // Call the method to sort names in alphabetical order and display results

        // Call the method to find the shortest surname and display results

        // Call the method to check if two names in the array are the same and display results

        // Call the method to concatenate name and surname with a space in between and display results


    }
}
