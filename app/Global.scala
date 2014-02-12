import logging.Logging
import play.api.{Application, GlobalSettings}

/**
 * Created by mwielocha on 12.02.2014.
 */
class Global extends GlobalSettings with Logging {

  override def onStart(app: Application): Unit = {
    logger.info("Achaia3 is starting...")
  }
}
