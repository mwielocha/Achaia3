package logging


/**
 * author mikwie
 *
 */
trait Logging {

  val logger: logging.Logger = play.api.Logger(getClass)

}
