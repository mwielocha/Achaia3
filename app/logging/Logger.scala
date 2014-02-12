package logging

import org.slf4j.LoggerFactory
import org.slf4j.helpers.MessageFormatter

/**
 * Created with IntelliJ IDEA.
 * User: mwielocha
 * Date: 17.04.2013
 * Time: 23:13
 * To change this template use File | Settings | File Templates.
 */
case class Logger(logger: play.api.Logger) {

  import Logger._

  def info(message: String, params: Any*) = logger.info(message -:- (params:_*))

  def infoIf(cond: Boolean)(message: String, params: Any*) = if(cond) info(message, params: _*)

  def warn(message: String, params: Any*) = logger.warn(message -:- (params: _*))

  def warnIf(cond: Boolean)(message: String, params: Any*) = if(cond) warn(message, params: _*)

  def debug(message: String, params: Any*) = logger.debug(message -:- (params: _*))

  def debugIf(cond: Boolean)(message: String, params: Any*) = if(cond) debug(message, params: _*)

  def trace(message: String, params: Any*) = logger.trace(message -:- (params: _*))

  def traceIf(cond: Boolean)(message: String, params: Any*) = if(cond) trace(message, params: _*)

  def error(message: String, params: Any*) = logger.error(message -:- (params: _*))

  def errorIf(cond: Boolean)(message: String, params: Any*) = if(cond) error(message, params: _*)

}

object Logger {

  implicit def playLogger2Logger(logger: play.api.Logger) = Logger(logger)

  implicit def string2TemplateString(input: String): TemplateString = TemplateString(input)

}

case class TemplateString(input: String) {

  def -:- (params: Any*): String = MessageFormatter.arrayFormat(input, params.toArray.asInstanceOf[Array[AnyRef]]).getMessage
}

