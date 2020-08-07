package com.messx.kafka.service;

import com.messx.kafka.dto.UserRequest;
import com.messx.kafka.mapper.UserMapper;
import com.messx.kafka.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
@AllArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    public User create(UserRequest userRequest){
        return userMapper.mapDtotoObject(userRequest);
    }
}
