package day2Homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(Java + React)","Engin Demirog", "�cretsiz");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�(C# + Angular)","Engin Demirog", "�cretsiz");
		Course course3 = new Course(3, "Programlamaya Giri� i�in Temel Kurs","Engin Demirog", "�cretsiz");
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println("Kurs Ad� : " + course.name);
			System.out.println("Kurs E�itmeni : " + course.instructor);
			System.out.println("Fiyat: " + course.price);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		
		courseManager.join(course2);

		courseManager.join(course3);

	}

}
