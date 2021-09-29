package com.github.nskvortsov.tempijplugin.services

import com.intellij.openapi.project.Project
import com.github.nskvortsov.tempijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
