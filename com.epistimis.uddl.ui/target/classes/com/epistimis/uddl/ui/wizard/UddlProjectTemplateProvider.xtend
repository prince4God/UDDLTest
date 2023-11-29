/*
 * generated by Xtext 2.32.0
 */
/*
 * Copyright (c) 2022, 2023 Epistimis LLC (http://www.epistimis.com).
 */
package com.epistimis.uddl.ui.wizard


import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

import static org.eclipse.core.runtime.IStatus.*

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
class UddlProjectTemplateProvider implements IProjectTemplateProvider {
	override getProjectTemplates() {
		#[new HelloWorldProject]
	}
}

@ProjectTemplate(label="Hello World", icon="project_template.png", description="<p><b>Hello World</b></p>
<p>This is a parameterized hello world for Uddl. You can set a parameter to modify the content in the generated file
and a parameter to set the package the file is created in.</p>")
final class HelloWorldProject {
	val advanced = check("Advanced:", false)
	val advancedGroup = group("Properties")
	val name = combo("Name:", #["Data Model", "Logical Data Model", "Platform Data Model", "Conceptual Data Model"], "Name of the data Model", advancedGroup)
	val path = text("Package:", "", advancedGroup)

	override protected updateVariables() {
		name.enabled = advanced.value
		path.enabled = advanced.value
		if (!advanced.value) {
			name.value = "Data Model"
			path.value = "uddl"
		}
	}

	override protected validate() {
		if (path.value.matches('[a-z][a-z0-9_]*(/[a-z][a-z0-9_]*)*'))
			null
		else
			new Status(ERROR, "Wizard", "'" + path + "' is not a valid package name")
	}

	override generateProjects(IProjectGenerator generator) {
		generator.generate(new PluginProjectFactory => [
			projectName = projectInfo.projectName
			location = projectInfo.locationPath
			projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
			builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
			folders += "src"
			folders += "src-gen"
			
			if (name.value == "Data Model"){
				addFile('''src/«path»/DataModel.uddl''', '''
				/*
				 * This is an example model
				 */
				dm DataModel "description of the data model" {
					/*
					 *Add Conceptual,Logical or Platform Data Model her
				
					*/
					
				}
			''')
			}
			
			else if (name.value == "Conceptual Data Model"){
				addFile('''src/«path»/ConceptualModel.uddl''', '''
				/*
				 * This is an example model
				 */
				 dm DataModel "description of the data model"{
				 	
				 	cdm ConceptualModel "description of the Conceptual model" {
				 		/*
						 *Add Conceptual elements or Conceptual Data Models Here
						*/
				 	}
				 }
				
			''')
			}
			
			else if (name.value == "Logical Data Model"){
				addFile('''src/«path»/LogicalDataModel.uddl''', '''
				/*
				 * This is an example model
				 */
				dm DataModel "description of the data model"{
					
					ldm LogicalDataModel "description of the Logical data model" {
						/*
						 *Add Logical elements or Logical Data Models Here
						*/					
				    }
				}
			''')
			}
			
			else if(name.value == "Platform Data Model"){
				addFile('''src/«path»/PlatformDataModel.uddl''', '''
				/*
				 * This is an example model
				 */
				dm DataModel "description of the data model"{
					
					pdm PlatformDataModel "description of the Platform model" {
						/*
						 *Add Platform elements or Platform data Models here
						*/
					}
				}
			''')
			}
			
			else{
				addFile('''src/«path»/DataModel.uddl''', '''
				/*
				 * This is an example model
				 */
				dm DataModel "description of the data model" {
					/*
					 *Add Conceptual,Logical or Platform Data Model here
					*/
					
				}
			''')
			}
			
		])
	}
}