package com.cep.config

import com.typesafe.config.{Config, ConfigFactory, ConfigObject}

trait AppConfig {
  private val defaultConfig :Config = ConfigFactory.parseResources("default.conf")

  val config :Config = ConfigFactory.parseResources("application.conf").withFallback(defaultConfig).resolve()
  val streamingCsvReadOptions :Config = config.getObject("streaming.csv.readOptions").toConfig

}
