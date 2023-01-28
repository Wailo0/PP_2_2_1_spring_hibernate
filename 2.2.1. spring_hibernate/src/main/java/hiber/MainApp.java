package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
//
//      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
//      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));


//      Car car1 = new Car("Aston Martin DB9", 3444554);
//      User user1 = new User("Aleksandr", "Igorevich", "aleksIgorevich@gmail.com", car1);
//
//      Car car2 = new Car("LADA Vesta", 1198796);
//      User user2 = new User("Vladimir", "Olegovich", "oleja1111@gmail.com", car2);
//
//      Car car3 = new Car("UAZ Patriot", 1112233);
//      User user3 = new User("Sergey", "ZAGLAVIN", "SEREJA@mail.com", car3);

//
//      userService.add(user1);
//      userService.add(user2);
//      userService.add(user3);


//      User testUser = userService.getUserByCarModelAndSeries("LADA Vesta", 1198796);
//      System.out.println(testUser);

//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         if (user.getCar() != null) {
//            System.out.println("Car = "+user.getCar());
//         }
//      }

      context.close();
   }
}
