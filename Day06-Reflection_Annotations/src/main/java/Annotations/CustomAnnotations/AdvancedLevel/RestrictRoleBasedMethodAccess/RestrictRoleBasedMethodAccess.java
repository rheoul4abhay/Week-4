package Annotations.CustomAnnotations.AdvancedLevel.RestrictRoleBasedMethodAccess;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class AdminService {
    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin task executed.");
    }
}

public class RestrictRoleBasedMethodAccess {
    public static void main(String[] args) throws Exception {
        String userRole = "USER";
        AdminService service = new AdminService();
        for (Method method : AdminService.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(RoleAllowed.class)) {
                RoleAllowed role = method.getAnnotation(RoleAllowed.class);
                if (!role.value().equals(userRole)) {
                    System.out.println("Access Denied!");
                } else {
                    method.invoke(service);
                }
            }
        }
    }
}