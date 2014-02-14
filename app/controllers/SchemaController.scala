package controllers

import play.api.mvc.{Action, Controller}
import play.api.libs.json.{JsArray, Json}

/**
 * Created by mwielocha on 13.02.2014.
 */
object SchemaController extends Controller {
  
  def getSchema(connection: String) = Action {
    // mock
    Ok(Json.obj(
      ("keyspaces" -> JsArray(Seq(
        Json.obj(
          "name" -> "A Keyspace #1"
        ),
        Json.obj(
          "name" -> "A Keyspace #2"
        ),
        Json.obj(
          "name" -> "A Keyspace #3"
        )
      )))
    ))
  }
}
