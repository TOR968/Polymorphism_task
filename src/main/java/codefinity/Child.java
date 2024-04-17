package codefinity;

//ToDo: Override a method from the parent class and then overload it.
// Overriden method should return such text: "This is the overriden method!"
//  The overloaded method should take a parameter of type int named "parameter" and return the following text:
//   "This is the overloaded method with int parameter: " + parameter
//    (Note that the method should return this text, not display it on the screen)

public class Child extends Parent {
    @Override
    public String method() {
        return "This is the overriden method!";
    }

    public String method(int parameter) {
        return "This is the overloaded method with int parameter: " + parameter;
    }
}
