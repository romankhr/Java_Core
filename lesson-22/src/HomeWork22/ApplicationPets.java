package HomeWork22;

public class ApplicationPets {

	public static void main(String[] args) {
		
		Voice cat=message->System.out.println(message);
		cat.sayVoice("ß ê³ò - Ìÿóóó-Ìÿóóóó");
		Voice dog=message->System.out.println(message);
		dog.sayVoice("ß Ïåñ - Ãàóóó-Ãàóóóó");
		Voice caw=message->System.out.println(message);
		caw.sayVoice("ß êîðîâà - Ìóóó-Ìóóóó");
		
		System.out.println();
		
		Action frogEat=action ->System.out.println(action);
		Action frogSleap=action ->System.out.println(action);
		Action frogSwim=action ->System.out.println(action);
		Action frogWalk=action ->System.out.println(action);
		
		frogEat.action("I can eat");
		frogSleap.action("I can sleap");
		frogSwim.action("I can swim");
		frogWalk.action("I can Walk");
	}

}
