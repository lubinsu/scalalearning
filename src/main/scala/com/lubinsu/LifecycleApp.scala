package com.lubinsu

/**
  * Created by lubinsu on 9/21/2016.
  */

import akka.actor.{ActorSystem, Props}

object LifecycleApp extends App {

  val actorSystem = ActorSystem("LifecycleActorSystem")
  val lifecycleActor = actorSystem.actorOf(Props[BasicLifecycleLoggingActor], "lifecycleActor")

  lifecycleActor ! "hello"

  //wait for a couple of seconds before shutdown
  Thread.sleep(2000)
  actorSystem.shutdown()

}