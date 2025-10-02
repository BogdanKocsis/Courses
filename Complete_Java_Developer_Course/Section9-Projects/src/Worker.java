public class Worker extends Employee {
    public Worker(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public String work() {
        return "I'm busy getting work done!";
    }
}
