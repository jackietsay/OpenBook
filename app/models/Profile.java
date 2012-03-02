package models;

import java.util.*;

import javax.persistence.*;

import controllers.Application;

import play.db.jpa.*;

@Entity
public class Profile extends Model {
  @OneToOne
  public User owner;
  public String gender; // The user's gender: female or male
  public String locale; // The user's locale (ISO Language Code and ISO Country
  
  @OneToOne
  public User significant_other; // The user's significant other
  public Date anniversary; // date of anniversary
  public String website; // The URL of the user's personal website
  
  public String bio; // The user's biography
  public Date birthday; // The user's birthday
  
  // not implemented yet!!
  @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
  public List<UserLanguage> languages; // The user's languages
  @ManyToOne
  public Location hometown; // The user's hometown
  
  public String political; // The user's political view
  public String quotes; // The user's favorite quotes
  public String relationship_status; // The user's relationship
  // status:Single, In a
  // relationship, Engaged,Married, It's
  // complicated, In an open
  // relationship, Widowed,Separated, Divorced, In
  // a civil union, In a domestic
  // partnership
  public String religion; // The user's religion
  
  // @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
  public List<Enrollment> education; // A list of the user's education
  // history
  
  public Date updated_time; // The last time the user's profile was updated;
  // changes to the
  // languages, link, timezone, verified,
  // interested_in, favorite_athletes, favorite_teams,
  // andvideo_upload_limits are not not reflected in
  // this value
  
  public Profile(User owner) {

    this.anniversary = null;
    this.bio = "";
    this.birthday = null;
    this.gender = null;
    this.hometown = null;
    this.owner = owner;
    this.political = null;
    this.quotes = "";
    this.significant_other = null;
    this.religion = "";
    this.education = new ArrayList<Enrollment>();
  }
}