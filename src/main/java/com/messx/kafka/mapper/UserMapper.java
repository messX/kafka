package com.messx.kafka.mapper;

import com.messx.kafka.dto.UserRequest;
import com.messx.kafka.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User mapDtotoObject(UserRequest userRequest);
}
