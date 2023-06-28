package gr.aueb.cf.ch11;

public class CFMain {

    public static void main(String[] args) {
        CodingFactoryLazy cf = CodingFactoryLazy.getInstance();
        cf.sayHello();

        CodingFactoryLazy cf2 = CodingFactoryLazy.getInstance();

    }
}
