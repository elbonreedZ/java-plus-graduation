package ru.practicum.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;
import ru.practicum.errors.ApiError;
import ru.practicum.errors.exceptions.NotFoundException;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CustomErrorDecoder implements ErrorDecoder {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public Exception decode(String methodKey, Response response) {
        String body;
        try {
            if (response.body() != null) {
                body = new String(response.body().asInputStream().readAllBytes(), StandardCharsets.UTF_8);

                ApiError apiError = objectMapper.readValue(body, ApiError.class);
                return new NotFoundException(apiError.getMessage());
            }
        } catch (IOException e) {
            return new RuntimeException("Ошибка при чтении тела ответа: " + e.getMessage(), e);
        }

        return new RuntimeException("Неизвестная ошибка при вызове " + methodKey + " (статус " + response.status() + ")");
    }
}


