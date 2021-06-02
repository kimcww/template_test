package com.github.kimcww.templatetest.services

import com.github.kimcww.templatetest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
