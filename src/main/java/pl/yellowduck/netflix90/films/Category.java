package pl.yellowduck.netflix90.films;

import javax.persistence.*;

@Entity
@Table(name = "category")
public class Category {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;
  @Column(name = "nameCategory")
  private String nameCategory;
  @Column (name = "description")
  private String description;;

  public Category(String nameCategory, String description) {
    this.nameCategory = nameCategory;
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