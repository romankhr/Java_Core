package HomeWork16;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

import ua.lviv.lgs.Person;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class animal=Animal.class;

		System.out.println("Name of class " + animal.getName());
		System.out.println("Simple name "+animal.getSimpleName());		
		
		int modifier = animal.getModifiers();
		String modifierText = Modifier.toString(modifier);

		System.out.println(modifierText + "   int mododifier   =  " + modifier);

		System.out.println("is static ??   " + Modifier.isStatic(modifier));
		System.out.println("is private ??   " + Modifier.isPrivate(modifier));
		System.out.println("is public ??   " + Modifier.isPublic(modifier));
		System.out.println("-------------");
		
		Package classPackage = animal.getPackage();
		System.out.println("Package of current class = " + classPackage);
		System.out.println("-------------");
		
		Class superClass = animal.getSuperclass();
		System.out.println("Superclass = " + superClass);
		System.out.println("----Interfaces---------");
		Class[] interfaces = animal.getInterfaces();
		System.out.println(Arrays.toString(interfaces));
		System.out.println("------Constructors-------");
		
		Constructor<Person>[] animalConstractor = animal.getConstructors();
		for (Constructor<Person> constructor : animalConstractor) {
			System.out.println("Constractor = " + constructor);
		}

		System.out.println("Constructor size = " + animalConstractor.length);
		System.out.println("-----parameters of constructor--------");
		
		Constructor<Person> constructor = animalConstractor[0];
		Class<?>[] parameterTypes = constructor.getParameterTypes();
		for (int i = 0; i < parameterTypes.length; i++) {
			Class<?> class1 = parameterTypes[i];
			System.out.println(class1);
		}
		
		System.out.println("-----set a new Animal--------");
		Constructor<Animal> singleConstructor = animal.getConstructor(String.class, String.class);
		System.out.println("Single constructor = " + singleConstructor);
		Animal newAnimal = singleConstructor.newInstance("Red", "Cat");
		System.out.println("reflaction Animal 1" + newAnimal);
		
		System.out.println("-----get public fields--------");
		
		Field[] fields = animal.getFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}
		System.out.println("----get all fields--------");

		fields = animal.getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			Field field = fields[i];
			System.out.println(field);
		}

		System.out.println("-------set the new data------");
		
		

		Field privateName = fields[0];
		privateName.setAccessible(true);
		privateName.set(newAnimal, "Kissa");
		Field privateAge = fields[2];
		privateAge.setAccessible(true);
		privateAge.set(newAnimal, 33);
		Field publicWeight = fields[3];
		publicWeight.set(newAnimal, 4);
		System.out.println("private Value " + privateName.get(newAnimal));
		System.out.println("reflaction Animal " + newAnimal);
		System.out.println("-----all methods--------");
		// get methods
		Method[] methods = animal.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			System.out.println(method);
		}
		System.out.println("-----use one of the methods--------");
		methods[2].invoke(newAnimal, "Nina");
		System.out.println(newAnimal);
		Method met=animal.getMethod("myMethod", String.class, int.class);
		System.out.println("\n-----use one of the methods--------");
		met.invoke(newAnimal, "FIFA", 5);
		Method met1=animal.getMethod("myMethod", String.class);
		System.out.println("\n-----use one of the methods--------");
		met1.invoke(newAnimal, "CoCa");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
