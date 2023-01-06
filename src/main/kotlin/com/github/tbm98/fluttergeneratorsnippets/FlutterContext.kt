package com.github.tbm98.fluttergeneratorsnippets

import com.intellij.codeInsight.template.TemplateActionContext
import com.intellij.codeInsight.template.TemplateContextType

class FlutterContext private constructor() :
    TemplateContextType( "FLUTTER_GENERATOR_SNIPPETS", "Flutter generator snippets") {
    override fun isInContext(templateActionContext: TemplateActionContext): Boolean {
        return templateActionContext.file.name.endsWith(".dart")
    }
}
