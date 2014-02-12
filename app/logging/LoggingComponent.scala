package logging


/**
 * author mikwie
 *
 */
trait LoggingComponent extends Logging {

  logger.info("*** [CREATE] - {}", getClass.getSimpleName)

}
