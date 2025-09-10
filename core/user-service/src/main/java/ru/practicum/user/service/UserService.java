package ru.practicum.user.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.practicum.dto.user.UserShortDto;
import ru.practicum.user.dto.NewUserRequest;
import ru.practicum.user.dto.UserAdminParam;
import ru.practicum.user.dto.UserDto;
import ru.practicum.user.model.User;

import java.util.List;
import java.util.Map;

public interface UserService {
    void deleteUser(long userId);

    UserDto createUser(NewUserRequest newUserRequest);

    List<UserDto> getAllUsers(UserAdminParam params);

    Map<Long, UserShortDto> getAllUsersByIds(List<Long> userIds);

    UserShortDto getById(Long id);

    void checkUserExists(Long id);
}
