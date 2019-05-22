package com.capg.java.json.jackson.jsonParserExample.service;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.capg.java.json.jackson.jsonParserExample.model.Address;
import com.capg.java.json.jackson.jsonParserExample.model.Employee;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonObjectMapper {

	public static void jsonMapper() throws IOException {

		byte[] jsonData = Files.readAllBytes(Paths.get(
				"C:\\Users\\likimp\\Documents\\programs\\json parser\\jsonParserExample\\jsonParserExample\\src\\main\\resources\\employee.txt"));

		// convert json string to object
		ObjectMapper objectMapper = new ObjectMapper();
		Employee emp1 = objectMapper.readValue(jsonData, Employee.class);

		System.out.println("object: " + emp1);

		/*
		 * object to json
		 * System.err.println(objectMapper.writerWithDefaultPrettyPrinter().
		 * writeValueAsString(emp1));
		 */

		// convert object to json string
		Employee emp2 = createEmployee();

		objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

		// other way to enable SerializationFeature
		// objectMapper.enable(SerializationFeature.INDENT_OUTPUT);

		StringWriter empString = new StringWriter();
		objectMapper.writeValue(empString, emp2);
		System.out.println("employee json is: " + empString);

	}

	public static Employee createEmployee() {

		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("David");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode("560100");
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}

}
