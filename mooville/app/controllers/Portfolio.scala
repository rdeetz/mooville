package controllers

import play.api._
import play.api.mvc._

object Portfolio extends Controller {

  def index = Action {
    Ok("portfolio data")
  }

}
