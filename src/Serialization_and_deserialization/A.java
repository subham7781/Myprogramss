package Serialization_and_deserialization;

import java.io.Serializable;

public class A implements Serializable {
	public String name = "kanha";
	transient String password ="testing";
}
