package pl.yellowduck.netflix90.films;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import pl.yellowduck.netflix90.common.Gender;
import pl.yellowduck.netflix90.common.Person;

@Getter
public class Director extends Person {

  @JsonCreator
  public Director(@JsonProperty("firstname") String firstname,
                  @JsonProperty("lastname") String lastname,
                  @JsonProperty("gender") Gender gender) {
    super(firstname, lastname, gender);
  }

  @Override
  public void introduce() {
    System.out.println("My name is " + getFirstname() + " " + getLastname() + ". I am director.");
  }


}
