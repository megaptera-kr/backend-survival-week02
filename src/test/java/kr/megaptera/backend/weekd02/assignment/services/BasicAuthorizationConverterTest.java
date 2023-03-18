package kr.megaptera.backend.weekd02.assignment.services;

import kr.megaptera.backend.weekd02.assignment.models.User;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class BasicAuthorizationConverterTest {

    private final User user = new User("testUser", "1234");
    private final String authorizationHeader = "Basic dGVzdFVzZXI6MTIzNA==";

    @Test
    public void encode_testUser_encodedWantIt(){
        var converter = new BasicAuthorizationConverter();
        var encodedText = converter.encode(user);
        assertTrue(encodedText.equals(authorizationHeader));
    }

    @Test
    public void decode_authorizationHeader_decodedWantIt() throws ParseException {
        var converter = new BasicAuthorizationConverter();
        var convertedUser = converter.decode(authorizationHeader);

        assertTrue(convertedUser.getName().equals(user.getName()));
        assertTrue(convertedUser.getPassword().equals(user.getPassword()));
    }
}