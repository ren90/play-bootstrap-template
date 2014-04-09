package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Products;
import views.html.Profile;
import views.html.Supplier;
import views.html.Admin;
import views.html.Category;

/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result products() {
    return ok(Products.render("Here's some products"));
    
  }
  
  public static Result profile() {
      return ok(Profile.render("Here's some profiles"));
      
    }
  public static Result admin() {
      return ok(Admin.render("Here's some admins"));
      
    }
  public static Result supplier() {
      return ok(Supplier.render("Here's some suppliers"));
      
    }

  public static Result category(String cat) {
      return ok(Category.render("Here's some products from " + cat));
      
    }
}
