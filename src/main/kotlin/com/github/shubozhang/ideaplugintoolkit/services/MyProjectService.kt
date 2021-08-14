package com.github.shubozhang.ideaplugintoolkit.services

import com.github.shubozhang.ideaplugintoolkit.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
