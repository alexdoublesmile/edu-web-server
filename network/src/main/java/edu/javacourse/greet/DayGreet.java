package edu.javacourse.greet;

import edu.javacourse.net.Greetable;

public class DayGreet extends Greetable {
    @Override
    public String buildResponse(String userName) {
        return String.format("Good day, %s!" , userName);
    }
}
