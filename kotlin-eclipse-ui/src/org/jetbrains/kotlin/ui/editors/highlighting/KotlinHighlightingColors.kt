/*******************************************************************************
* Copyright 2000-2015 JetBrains s.r.o.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*
*******************************************************************************/
package org.jetbrains.kotlin.ui.editors.highlighting

import org.eclipse.jdt.internal.ui.javaeditor.SemanticHighlightings
import org.eclipse.swt.graphics.RGB

class KotlinHighlightingAttributes private constructor() {
    companion object {
        fun withAttributes(changeAttributes: KotlinHighlightingAttributes.() -> Unit): KotlinHighlightingAttributes {
            val attributes = KotlinHighlightingAttributes()
            attributes.changeAttributes()
            return attributes
        }
        
        val LOCAL_FINAL_VARIABLE = withAttributes { 
            this.styleKey = SemanticHighlightings.LOCAL_VARIABLE
        }
        
        val LOCAL_VARIABLE = withAttributes { 
            this.styleKey = SemanticHighlightings.LOCAL_VARIABLE
            this.underline = true
        }
        
        val PARAMETER_VARIABLE = withAttributes { 
            this.styleKey = SemanticHighlightings.PARAMETER_VARIABLE
        }
        
        val FIELD = withAttributes { 
            this.styleKey = SemanticHighlightings.FIELD
            this.underline = true
        }
        
        val FINAL_FIELD = withAttributes { 
            this.styleKey = SemanticHighlightings.FIELD
        }
        
        val STATIC_FIELD = withAttributes { 
            this.styleKey = SemanticHighlightings.STATIC_FIELD
            this.underline = true
        }
        
        val STATIC_FINAL_FIELD = withAttributes { 
            this.styleKey = SemanticHighlightings.STATIC_FINAL_FIELD
        }
        
        val TYPE_PARAMETER = withAttributes { 
            this.styleKey = SemanticHighlightings.TYPE_VARIABLE
        }
        
        val ANNOTATION = withAttributes { 
            this.styleKey = SemanticHighlightings.ANNOTATION
        }
        
        val ENUM_CLASS = withAttributes { 
            this.styleKey = SemanticHighlightings.ENUM
        }
        
        val INTERFACE = withAttributes { 
            this.styleKey = SemanticHighlightings.INTERFACE
        }
        
        val CLASS = withAttributes { 
            this.styleKey = SemanticHighlightings.CLASS
        }
        
        val FUNCTION_DECLARATION = withAttributes { 
            this.styleKey = SemanticHighlightings.METHOD_DECLARATION
        }
    }
    
    lateinit var styleKey: String
    var underline = false
}