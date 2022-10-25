package org.soyphea.k8s.srevice;

import org.soyphea.k8s.domain.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.h2.security.SHA256;

@Service
public class UserService {

    List<User> users = Arrays.asList(new User(1, "Dara"), new User(2, "Seyha"));
    
    String password = "123456789";
    
    String inputString = "s3cr37";
    byte[] key         = inputString.getBytes();
    SHA256.getHMAC(key, "message");

    public List<User> getUser(String containName) {

        return users.stream().filter(user -> user.getName().contains(containName)).collect(Collectors.toList());
    }

}
