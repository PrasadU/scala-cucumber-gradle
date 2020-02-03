package com.cep.config

trait FlowConfig extends AppConfig {
  def flowId

  val flowName :String = config.getString(flowId + ".flowName").trim
}
