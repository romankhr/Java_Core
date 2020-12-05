package homeWork21;

import java.lang.reflect.Field;

public class AppMyAnnotation {

	public static void main(String[] args) {
		Animal animal = new Animal("Misha", "Leon", 6);

		System.out.println(animal);
		System.out.println("\n-----------------------\n");
		getAnnotationValue(Animal.class);

	}

	public static void getAnnotationValue(Class<?> customClass) {
		Field[] fields = customClass.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			if (field.getAnnotation(MyAnnotation.class) instanceof MyAnnotation) {
				System.out.print(field.getName() + "-----");
				System.out.println("annotation value = " + field.getAnnotation(MyAnnotation.class).params());
				System.out.println("annotation Type = " + field.getAnnotation(MyAnnotation.class).annotationType());
			}
		}
	}
}
