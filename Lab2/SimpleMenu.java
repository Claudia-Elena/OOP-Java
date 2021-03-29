package tema2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMenu {
	private Scanner consoleScanner = new Scanner(System.in);
	private ArrayList<Student> studentsList = new ArrayList<Student>();

	protected void DisplayMenu() {
		try {
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		} catch (InterruptedException | IOException e) {
			System.out.println("Consola nu poate fi curatata " + e.getMessage());
		}
		System.out.println("***** GESTIONARE STUDENTI ******\n");
		System.out.println("0. Iesire");
		System.out.println("1. Adaugare");
		System.out.println("2. Modificare");
		System.out.println("3. Stergere");
		System.out.println("4. Vizualizare");
		System.out.println("\nIntorduceti optiunea dvs.: ");

	}

	public void Run() {
		int option = 0;

		do {
			DisplayMenu();
			option = consoleScanner.nextInt();
			switch (option) {
			case 1:
				uiAddStudent();
				break;
			case 2:
				uiModifyStudent();
				break;
			case 3:
				uiDeleteStudent();
				break;
			case 4:
				uiViewStudents();
				break;

			default:
				System.out.println("\nAlegeti o optiune valida");

			}

		} while (option != 0);

		System.out.println("Aplicatia se inchide ...");
	}

	private void uiViewStudents() {

		System.out.println("nume \tprenume\tan\tspecializare");

		for (Student currentStudent : studentsList) {
			System.out.print(currentStudent.getNume() + "\t" + currentStudent.getPrenume() + "\t"
					+ currentStudent.getAn() + "\t" + currentStudent.getSpecializare() + "\n");
			;
		}

	}

	private void uiDeleteStudent() {
		System.out.println("Sterge date Student");
		String nume1 = consoleScanner.next();
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

	}

	private void uiModifyStudent() {
		System.out.println("Modifica date Student");

		System.out.println("Introduceti numele persoanei pe care doriti sa o modificati ");
		String nume1 = consoleScanner.next();
		Student stud1 = this.CautareDupaNume(nume1);
		
		System.out.println("Introduceti ce doriti sa modificati ");

		System.out.println("1  Schimbati nume ");
		System.out.println("2  Shimbati prenume ");
		System.out.println("3  Schimbati an ");
		System.out.println("4  Schimbati specializare ");

		int option = consoleScanner.nextInt();
		if (option == 1) {
			System.out.println("Introduceti nume nou ");
			String numeNou = consoleScanner.next();
			stud1.setNume(numeNou);
		}

		else if (option == 2) {
			System.out.println("Introduceti prenume nou ");
			String prenumeNou = consoleScanner.next();
			stud1.setPrenume(prenumeNou);
		}

		else if (option == 3) {
			System.out.println("Introduceti an nou ");
			int anNou = consoleScanner.nextInt();
			stud1.setAn(anNou);
		}

		else if (option == 4) {
			System.out.println("Introduceti specializare noua ");
			String specializareNoua = consoleScanner.next();
			stud1.setSpecializare(specializareNoua);
		}
		

	}

	private void uiAddStudent() {
		System.out.println("Adauga date Student");
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

	public Student CautareDupaNume(String nume1) {
		int i = 0;
		while (studentsList.get(i).getNume().equals(nume1) == false) {
			i++;
		}
		return studentsList.get(i);
	}

}