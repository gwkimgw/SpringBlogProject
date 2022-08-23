package com.cos.springblogproject.service;

import com.cos.springblogproject.model.RoleType;
import com.cos.springblogproject.model.User;
import com.cos.springblogproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Transactional
    public void join(User user) {
        String rawPwd = user.getPassword();
        String encPwd = encoder.encode(rawPwd);
        user.setPassword(encPwd);
        user.setRole(RoleType.USER);
        userRepository.save(user);
    }

    @Transactional
    public void update(User user) {
        User editUser = userRepository.findById(user.getId()).orElseThrow(() -> {
            return new IllegalArgumentException("failed");
        });
        String rawPwd = user.getPassword();
        String encodePwd = encoder.encode(rawPwd);
        editUser.setPassword(encodePwd);
        editUser.setEmail(user.getEmail());
    }

//    @Transactional(readOnly = true)
//    public User login(User user) {
//        return userRepository.findByUsernameAndPassword(user.getUsername(), user.getPassword());
//    }
}
