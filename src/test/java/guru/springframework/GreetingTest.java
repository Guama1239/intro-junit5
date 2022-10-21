package guru.springframework;

class GreetingTest {

    @org.junit.jupiter.api.Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld());
    }

    @org.junit.jupiter.api.Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("Pancho"));
    }
}