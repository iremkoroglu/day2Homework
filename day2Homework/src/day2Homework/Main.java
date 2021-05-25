package day2Homework;

public class Main {

	public static void main(String[] args) {
		
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý(Java + React)","Engin Demirog", "Ücretsiz");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý(C# + Angular)","Engin Demirog", "Ücretsiz");
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs","Engin Demirog", "Ücretsiz");
		
		Course[] courses = {course1, course2, course3};
		
		for (Course course : courses) {
			System.out.println("Kurs Adý : " + course.name);
			System.out.println("Kurs Eðitmeni : " + course.instructor);
			System.out.println("Fiyat: " + course.price);
		}

		CourseManager courseManager = new CourseManager();
		courseManager.join(course1);
		
		courseManager.join(course2);

		courseManager.join(course3);

	}

}
