package sem5;


import sem5.controllers.UserController;
import sem5.model.*;
import sem5.views.ViewUser;

public class Main {
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users1.txt");
        Repository repository = new RepositoryFile(fileOperation, new UserMapper());
        UserController controller = new UserController(repository);
        ValidateUser validate = new ValidateUser();
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}


