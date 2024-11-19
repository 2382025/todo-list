import todoapp.config.Database;
import todoapp.repositories.TodoListRepository;
import todoapp.repositories.TodoListRepositoryDbImpl;
import todoapp.services.TodoListService;
import todoapp.services.TodoListServiceImpl;
import todoapp.views.TodoListTerminalViewImpl;
import todoapp.views.TodoListView;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.beans.BeanProperty;

@ComponentScan(basePackages = "todoapp")
public class Main {
    public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
    TodoListView todoListView = context,getBean(TodoListView.class);
    todoListView.run();


    }

    @Bean
    Database database(){
        Database database = new Database("databaseku", "root", "", "localhost", "3306");
        database.setup();
        return database;
    }
}
