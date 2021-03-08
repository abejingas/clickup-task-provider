package com.github.abejingas.clickuptaskprovider.services

import com.github.abejingas.clickuptaskprovider.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
