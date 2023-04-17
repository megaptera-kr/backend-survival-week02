package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.User;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Base64;

@Component
public class BasicAuthorizationConverter {

    private final String basicText = "Basic ";
    private final String userDelimiter = ":";

    public String encode(User user) {
        var decodedText = user.getName() + userDelimiter + user.getPassword();
        var encodedBytes = Base64.getEncoder().encode(decodedText.getBytes());
        var encodedText = new String(encodedBytes);

        return basicText + encodedText;
    }

    public User decode(String authorizeHeader) throws ParseException {
        if (!authorizeHeader.contains(basicText)) {
            throw new ParseException(authorizeHeader, 1);
        }

        var encodedText = authorizeHeader.substring(basicText.length());
        var encodedBytes = encodedText.getBytes();
        var decodedBytes = Base64.getDecoder().decode(encodedBytes);
        var decodedText = new String(decodedBytes);

        var userSource = decodedText.split(userDelimiter);
        var user = new User();
        user.setName(userSource[0]);
        user.setPassword(userSource[1]);

        return user;
    }
}
