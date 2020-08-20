package ServiceLocatorPattern;

public class InitialContext {
  public Object lookUp(String jndiName) {
      if(jndiName.equalsIgnoreCase("Service1")) {
          System.out.println("Looking up and creating Service1");
          return new Service1();
      } else if(jndiName.equalsIgnoreCase("Service2")) {
          System.out.println("Looking up and creating Service2");
          return new Service2();
      }
      return null;
  }
}
