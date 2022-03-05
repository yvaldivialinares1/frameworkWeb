package utils;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.Calendar;

public class DataGenerator {
    private static Faker faker = new Faker();

    public static String getEmail() {
        return faker.internet().emailAddress();
    }
    public static String getPassword() {
        return faker.internet().password();
    }
}
