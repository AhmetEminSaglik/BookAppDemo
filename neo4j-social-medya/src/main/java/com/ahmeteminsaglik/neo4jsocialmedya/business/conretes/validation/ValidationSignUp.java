package com.ahmeteminsaglik.neo4jsocialmedya.business.conretes.validation;

import com.ahmeteminsaglik.neo4jsocialmedya.business.abstracts.UserService;
import com.ahmeteminsaglik.neo4jsocialmedya.business.abstracts.Validation;
import com.ahmeteminsaglik.neo4jsocialmedya.model.User;
import com.ahmeteminsaglik.neo4jsocialmedya.utility.exception.InvalidInputException;
import com.ahmeteminsaglik.neo4jsocialmedya.utility.result.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ValidationSignUp implements Validation {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    Logger logger = LoggerFactory.getLogger(ValidationSignUp.class);
    private final static int minLength = 1;
    private final static int maxLength = 15;

    @Override
    public DataResult<User> validate(User user) {
        boolean isUsernameAvailable = isUsernameAvailable(user.getUsername());
        if (isUsernameAvailable) {
            return inputValidations(user);
        }
        return new ErrorDataResult<>("Username is unavaiable. Please type another username.");
    }

    private DataResult<User> inputValidations(User user) {
        try {
            validateName(user.getName());
            validateLastname(user.getLastname());
            validateUsername(user.getUsername());
            validatePassword(user.getPassword());
            return new SuccessDataResult<>(user, "User is sing up successfully");
        } catch (InvalidInputException e) {
            logger.error(e.getMessage());
            return new ErrorDataResult(e.getMessage());
        }
    }

    private void validateName(String name) throws InvalidInputException {
        String inputArea = "name";
        isDataFilled("name", name);
        isTextLengthProper(inputArea, name, minLength, maxLength);
    }

    private void validateLastname(String lastname) throws InvalidInputException {
        String inputArea = "lastname";
        isDataFilled(inputArea, lastname);
        isTextLengthProper(inputArea, lastname, minLength, maxLength);
    }

    private void validateUsername(String username) throws InvalidInputException {
        String inputArea = "username";
        isDataFilled(inputArea, username);
        isTextLengthProper(inputArea, username, minLength, maxLength);
    }

    private void validatePassword(String password) throws InvalidInputException {
        String inputArea = "password";
        isDataFilled(inputArea, password);
        isTextLengthProper(inputArea, password, minLength, maxLength);
    }


    private boolean isTextLengthProper(String inputArea, String text, int min, int max) throws InvalidInputException {
        if (text.length() < min || text.length() > max) {
            throw new InvalidInputException(inputArea, min, max);
        }
        return true;
    }

    private boolean isDataFilled(String inputArea, String text) throws InvalidInputException {
        if (text == null) {
            throw new InvalidInputException(inputArea);
        }
        return true;
    }

    private boolean isUsernameAvailable(String username) {
        System.out.println("Username : " + username);
        User user = userService.findByUsername(username);
        System.out.println("user : " + user);
        if (user == null) {
            return true;
        }
        return false;
    }
}
