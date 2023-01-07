package com.tikay.prohub.core.model

/*  
 * Created by TIKAY on Jan 04, 2023.
 * Copyright (c) 2023. All rights reserved.
 */

interface Agent{
     val id:String
}

data class Driver(
    val name:String,
    override val id: String
): Agent

class AgentClient {
    val driver = Driver("name","id")
    fun check(agent: Agent){
        when(agent){
            is Driver ->{
              val a =  agent.copy(driver.name,driver.id)
                agent.name
            }
        }
    }
}