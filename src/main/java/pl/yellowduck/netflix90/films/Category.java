
package pl.yellowduck.netflix90.films;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String name;

  private String description;

  Category() {
  }

  public Category(String name, String description) {
    this.name = name;
    this.description = description;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}

//public enum Category {
//
//  COMEDY, // orinal value 0
//
//  FANTASY,
//
//  DRAMA,  // orinal value 1
//
//  HORROR, // orinal value 2
//
//  MUSICAL, // orinal value 3
//
//  ACTION; // orinal value 4
//}