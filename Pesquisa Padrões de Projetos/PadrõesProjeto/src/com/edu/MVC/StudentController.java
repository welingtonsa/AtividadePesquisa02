package com.edu.MVC;

public class StudentController {
    /* Atributos da classe StudentController */
    private Student model;
    private StudentView view;

    /* Metodo construtor da classer StudentController */
    public StudentController(Student model, StudentView view){
        this.model = model;
        this.view = view;
    }

    /* Metodos da classe studentController */
    public void updateview(){
        view.printStudentDetails(model.getName(), model.getRuleNumber());
    }



    /* Metodos getters and setters da classe Student */
    public void setStudentName(String name){
        model.setName(name);
    }

    public String getStudentName(){
        return model.getName();
    }

    public Student getModel() {
        return model;
    }

    public void setModel(Student model) {
        this.model = model;
    }

    public StudentView getView() {
        return view;
    }

    public void setView(StudentView view) {
        this.view = view;
    }

    
  

    
}
