package com.lubinsu

/**
  * Created by lubinsu on 9/21/2016.
  */

import akka.actor.{Actor, ActorLogging}
import akka.event.LoggingReceive

class BasicLifecycleLoggingActor extends Actor with ActorLogging {

  log.info("Inside BasicLifecycleLoggingActor Constructor")
  log.info(context.self.toString())
  override def preStart() = {
    log.info("Inside the preStart method of BasicLifecycleLoggingActor")
  }

  def receive = LoggingReceive {
    case "hello" => log.info("hello")
  }

  override def postStop() = {
    log.info("Inside postStop method of BasicLifecycleLoggingActor")
  }

}
