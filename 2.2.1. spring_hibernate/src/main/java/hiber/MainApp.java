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

//      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
//      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
//      userService.add(new User("User3", "Lastname3", "user3@mail.ru"));
//      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));

//      User user1 = new User("Aleksandr", "Igorevich", "aleksIgorevich@gmail.com");
//      Car car1 = new Car("Aston Martin DB9", 3444554);
//      user1.addCarToUser(car1);

//      User user2 = new User("Vladimir", "Olegovich", "oleja1111@gmail.com");
//      Car car2 = new Car("LADA Vesta", 1198796);
//      user2.addCarToUser(car2);

//      User user3 = new User("Sergey", "ZAGLAVIN", "SEREJA@mail.com");
//      Car car3 = new Car("UAZ Patriot", 1112233);
//      user3.addCarToUser(car3);

//      userService.add(user3);


      User testuser = userService.getUserByCarModelAndSeries("UAZ Patriot", 1112233);
      System.out.println(testuser); // "Sergey", "ZAGLAVIN", "SEREJA@mail.com"

//      List<User> users = userService.listUsers();
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }

      context.close();
   }
}
