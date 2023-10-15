package com.example.springbootfirstapp;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class StudentController {
// http://localhost:8080/student
//@GetMapping("/student")
//public student getStudent() {
//return new tudent("Ramesh", "Fadatare");
//}
//}

//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
//@RestController
//public class StudentController {
//@GetMapping("/students")
//public List<student> getStudents(){
//List<student> students = new ArrayList<>();
//students.add(new student("Ramesh", "Fadatare"));
//students.add(new student("Tony", "Cena"));
//students.add(new student("Sanjay", "Jadhav"));
//students.add(new student("Ram", "Jadhav"));
//students.add(new student("Umesh", "Fadatare"));
//return students;
//}
//}

/*import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
// http://localhost:8080/student/1
// @PathVariable annotation
@GetMapping("/student/{firstName}/{lastName}/")
public student studentPathVariable(@PathVariable("firstName") String
firstName,
@PathVariable("lastName") String lastName) {
return new student(firstName, lastName);
}
}*/

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class StudentController {
// build rest API to handle query parameters
//http://localhost:8080/student/query?firstName=Ramesh&lastName=Fadatare
@GetMapping("/student/query")
public student studentQueryParam(
@RequestParam(name = "firstName") String firstName,
@RequestParam(name = "lastName") String lastName) {
return new student(firstName, lastName);
}
}


