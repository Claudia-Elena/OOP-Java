/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reusablemenu.sample;





import java.util.ArrayList;
import java.util.Scanner;
import reusablemenu.abstractions.IMenuItem;
import reusablemenu.implementation.Menu;
import reusablemenu.implementation.MenuItem;
import reusablemenu.sample.Student;

/**
 *
 * @author catalin
 */
public class ApplicationMenu{
	ArrayList<Student> studentsList = new ArrayList<Student>();
	private Scanner consoleScanner=new Scanner(System.in);
    private Menu mainMenu = null;
    
   
    public ApplicationMenu()
    {
                 
    }
    private void uiModifyStudentName() {
    	System.out.println("Introduceti nume Student ale caror date doriti sa  modificati ");
		String nume1 = consoleScanner.next();
		Student stud1 = this.CautareDupaNume(nume1);
		System.out.println("Introduceti nume nou ");
		String numeNou = consoleScanner.next();
		stud1.setNume(numeNou);
    }
    private void uiModifyStudentPreName() {
    	System.out.println("Introduceti nume Student ale caror date doriti sa  modificati ");
		String nume1 = consoleScanner.next();
		Student stud1 = this.CautareDupaNume(nume1);
		System.out.println("Introduceti prenume nou ");
		String prenumeNou = consoleScanner.next();
		stud1.setPrenume(prenumeNou);
    }
    
    private void uiModifyStudentAn() {
    	System.out.println("Introduceti nume Student ale caror date doriti sa  modificati ");
		String nume1 = consoleScanner.next();
		Student stud1 = this.CautareDupaNume(nume1);
		System.out.println("Introduceti an nou ");
		int anNou = consoleScanner.nextInt();
		stud1.setAn(anNou);
    }
    private void uiModifyStudentSpecializare() {
    	System.out.println("Introduceti nume Student ale caror date doriti sa  modificati ");
		String nume1 = consoleScanner.next();
		Student stud1 = this.CautareDupaNume(nume1);
		System.out.println("Introduceti specializare noua ");
		String specializareNoua = consoleScanner.next();
		stud1.setSpecializare(specializareNoua);
    }
    
   
    public Student CautareDupaNume(String nume1) {
		int i = 0;
		
		while (studentsList.get(i).getNume().equals(nume1) == false) {
			i++;
		}
		return studentsList.get(i);
	}

    
	private void uiDeleteBook() {
		System.out.println("----Sterge date Student----");
		String nume1 = consoleScanner.next();
		try {
		for (int i = 0; i < studentsList.size(); i++) {

			if (studentsList.get(i).getNume().equals(nume1)) {

				studentsList.remove(studentsList.get(i));
				System.out.println("Datele studentului  au fost sterse");
				return;
			}
			else {
				System.out.println("Datele introduse nu au fost gasite");
			}
		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Stergere efectuata");
		
	}
	
	
	
	private void uiViewStudents() {

		System.out.println("nume \tprenume\tan\tspecializare");

		for (Student currentStudent : studentsList) {
			System.out.print(currentStudent.getNume() + "\t" + currentStudent.getPrenume() + "\t"
					+ currentStudent.getAn() + "\t" + currentStudent.getSpecializare() + "\n");
			;
		}

	}
	
	
    private void uiAddBook() {
		System.out.println("-----Adauga date Student-----");
		System.out.println("Introduceti nume ");
		String nume = consoleScanner.next();
		System.out.println("Introduceti prenume ");
		String prenume = consoleScanner.next();
		System.out.println("Introduceti anul ");
		int an = consoleScanner.nextInt();
		System.out.println("Introduceti specializarea ");
		String specializare = consoleScanner.next();
		Student student1 = new Student(nume, prenume, an, specializare);
		studentsList.add(student1);
	}
    
    public void load()
    {
        
        ArrayList<IMenuItem> menuItems = new ArrayList();
       // ArrayList<IMenuItem> showStudentsOptions = new ArrayList();
        ArrayList<IMenuItem> showModifyOptions = new ArrayList();
        
        
        int shortCut = 1;    
        //////////////------------adaugare-----------//////////////////////
         
       IMenuItem currentItem = new MenuItem("Adaugare student", shortCut++, (parameters)->{
           uiAddBook();
       });       
       menuItems.add(currentItem);
       
       
       
            //////////////------------stergere-----------//////////////////////
       currentItem = new MenuItem("Sterge date student", shortCut++, (parameters)->{
    	   	uiDeleteBook();
       });       
       menuItems.add(currentItem);      
       
       
       
       /////////////------------meniu modificare--------------///////////////////
       showModifyOptions.add(new MenuItem("Modificare dupa nume",1,(parameters) ->{
    	   uiModifyStudentName();
       }));
       
       showModifyOptions.add(new MenuItem("Modificare  prenume",2,(parameters) ->{
    	   uiModifyStudentPreName();
       }));
       showModifyOptions.add(new MenuItem("Modificare  an",3,(parameters) ->{
    	   uiModifyStudentAn();
       }));
       showModifyOptions.add(new MenuItem("Modificare  specializare",4,(parameters) ->{
    	   uiModifyStudentSpecializare();
       }));
        
       currentItem = new Menu("Modifica date studenti", shortCut++, showModifyOptions);       
       menuItems.add(currentItem);
       
       
       
       //////////////------------afisare-----------//////////////////////
       currentItem = new MenuItem("Afisare date student", shortCut++, (parameters)->{
    	   uiViewStudents() ;
      });       
      menuItems.add(currentItem);  
      
        
        mainMenu = new Menu("Main Menu", -1, menuItems);
        
    }
    
    public void execute()
    {
        mainMenu.execute();
    }
    
}
