package com.cep.config

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class AppConfigTest extends FunSuite {

  test("basic app config read") {
    var appConfig: AppConfig = new AppConfig {}
    val streamingCsvReadOptions = appConfig.streamingCsvReadOptions
    assertResult(",") { streamingCsvReadOptions.getString("sep") }
    assertResult("abc") { streamingCsvReadOptions.getString("test") }
  }

}
