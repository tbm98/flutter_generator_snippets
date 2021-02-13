package com.github.tbm98.fluttergeneratorsnippets.services

import com.github.tbm98.fluttergeneratorsnippets.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
