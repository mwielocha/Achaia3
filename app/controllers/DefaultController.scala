package controllers

import play.api.mvc.{Action, Controller}

/**
 * Created by mwielocha on 12.02.2014.
 */
object DefaultController extends Controller {

  def index = Action {
    Ok("good")
  }
}
