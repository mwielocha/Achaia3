package commons.logging


/**
 * author mikwie
 *
 */
trait Logging {

  val logger: commons.logging.Logger = play.api.Logger(getClass)

}
