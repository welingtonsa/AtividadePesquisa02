import com.edu.AbstractFactory.AbstractFactory;
import com.edu.AbstractFactory.Figure;
import com.edu.AbstractFactory.IFigure;
import com.edu.MVC.Student;
import com.edu.MVC.StudentController;
import com.edu.MVC.StudentView;
import com.edu.Singletom.SingleTomClass;

public class App {
    public static void main(String[] args) throws Exception {
       
        /* Teste da classes AbstractFactory
        IFigure quadrado = AbstractFactory.create(5, 5, Figure.SQUARE);
        IFigure retangulo = AbstractFactory.create(5,  6, Figure.RETANGULO);

        System.out.println(quadrado);
        System.out.println(retangulo); */


        /* Teste da classe Single tom 
        SingleTomClass fist = SingleTomClass.getInstance();
        SingleTomClass seconf = SingleTomClass.getInstance();

        fist.name = "Hadoukem";
        System.out.println(fist);
        System.out.println(fist.toString());
        System.out.println(fist.name);
        System.out.println(seconf.name);
        System.out.println(seconf.getDetailOfClass());*/

        /* Testa da classes MVC */
        Student estudante = new Student();
        estudante.setName("Welington");
        estudante.setRuleNumber("15UCS157");
        
        StudentView view = new StudentView();
        StudentController controller = new StudentController(estudante, view);
        controller.updateview();
        controller.setStudentName("Morpheu");
        controller.updateview();

    }
}
