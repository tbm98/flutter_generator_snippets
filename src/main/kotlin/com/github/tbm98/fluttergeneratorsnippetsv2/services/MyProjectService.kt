package com.github.tbm98.fluttergeneratorsnippetsv2.services

import com.github.tbm98.fluttergeneratorsnippetsv2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
