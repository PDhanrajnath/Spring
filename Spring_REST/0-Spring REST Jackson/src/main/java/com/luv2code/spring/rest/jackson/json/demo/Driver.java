package com.luv2code.spring.rest.jackson.json.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class Driver {

    public static void main(String[] args){

        try {

            //create the object mapper
            ObjectMapper mapper = new ObjectMapper();

            //read the JSON file and map/convert JAVA POJO: data/sample-lite.json
//            Student myStudent = mapper.readValue(new File("data/sample-lite.json"),Student.class);


            // handling different json file which has different content!
            Student myStudent = mapper.readValue(new File("data/sample-full.json"),Student.class);


            //print firstName and lastName ...
            System.out.println("First Name: "+myStudent.getFirstName() + "\n"+"Last Name: "+myStudent.getLastName());

            //print the address: street and city
            Address tempAddress = myStudent.getAddress();

            System.out.println("Street: "+tempAddress.getStreet());
            System.out.println("City: "+tempAddress.getCity());

            //print the languages ...
            System.out.println("Languages: ");
            for (String tempLang:myStudent.getLanguages()){
                System.out.println(tempLang);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }


    }
}
