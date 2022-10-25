package org.soyphea.k8s.srevice;

import org.soyphea.k8s.domain.User;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import java.servlet.http.Cookie;
import java.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class UserService {

    List<User> users = Arrays.asList(new User(1, "Dara"), new User(2, "Seyha"));
    
    String password = "123456789";

    public List<User> getUser(String containName) {

        return users.stream().filter(user -> user.getName().contains(containName)).collect(Collectors.toList());
    }

}


@RequestMapping(value = "/")
public void index(HttpServletResponse res, String value) {
    res.setHeader("Set-Cookie", value);  // Noncompliant
    Cookie cookie = new Cookie("jsessionid", value);  // Noncompliant
    res.addCookie(cookie);
}
