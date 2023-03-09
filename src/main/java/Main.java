import model.Student;

public class Main {

    public static void main(String[] args) {
        Book borasBook = new Book();

        borasBook.setCover("Gebunden");
        borasBook.setAuthor("Joseph Murphy");
        borasBook.setTitle("Positive Thinking");

        Book janesBook = new Book("Secret", "Lebensweg", "Karla Jung", 100, "12345657", "Hayne", 49.55);

        System.out.println(borasBook.getCover());
        System.out.println(borasBook.getAuthor());
        System.out.println(borasBook.getTitle());
        System.out.println(borasBook.getIsbn());

        System.out.println(janesBook);
        System.out.println(borasBook);
        //Book janesBook = new Book();

        janesBook.setCover ("Secret");
        janesBook.setAuthor("Linda Byrne");

        System.out.println(janesBook.getCover());
        System.out.println(janesBook.getAuthor());
        Book book1 = new Book();
        Book book2 = new Book();

        if(borasBook.equals(book2)){
            System.out.println("Is it same");
        } else {
            System.out.println("Not the same");
        }

        Student student1 = new Student("Jane", "Music", 1234567);
        Student student2 = new Student("John", "Sport", 7654321);

        //model.Student junior = new model.Student();
        System.out.println(student1.getName());
        System.out.println(student1.getDepartment());
        System.out.println(student1.getEnrollmentNumber());

        System.out.println(student1);
        System.out.println(student2);

        // Zwei Objekte vergleichen, if they are euqals
        //model.Student student1 = new model.Student();
        //model.Student student2 = new model.Student();

        System.out.println(student1.equals(student2));

       if(student1.equals(student2)){
            System.out.println("Is it same");
        } else {
            System.out.println("Not the same");
        }

        /*junior.setName("Jane");
        junior.setDepartment("Music");
        junior.setEnrollmentNumber(1234567);*/

        System.out.println(StudentDB.getAllStudents());
    }
}
