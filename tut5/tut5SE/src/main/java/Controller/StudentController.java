package Controller;

import Entity.Student;
import Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("student",studentService.getAllStudents());
        return "home";
    }
    @GetMapping("{id}")
    public String getStudentById(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("student",studentService.getStudentById(id));
        return "studentDetails";
    }
    @PostMapping("/addStudent")
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "home";
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable(value = "id") Long id) {
        studentService.deleteStudent(id);
        return "home";
    }
    @PutMapping("/update/{id}")
    public String updateStudent(@PathVariable(value = "id") Long id, Student student) {
        studentService.updateStudent(id,student);
        return "home";
    }
}
