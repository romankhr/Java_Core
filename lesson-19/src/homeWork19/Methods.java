package homeWork19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {

	public void writeFileSerialize(File file, Serializable object) throws Exception {
		OutputStream newOutputFile = new FileOutputStream(file);
		ObjectOutputStream newOutputObject = new ObjectOutputStream(newOutputFile);
		newOutputObject.writeObject(object);
		newOutputObject.close();

	}

	public Serializable readFileSerialize(File file) throws Exception {
		FileInputStream readFile = new FileInputStream(file);
		ObjectInputStream readObjectFromFile = new ObjectInputStream(readFile);
		Serializable object = (Serializable) readObjectFromFile.readObject();

		readObjectFromFile.close();
		readFile.close();

		return object;

	}
}
