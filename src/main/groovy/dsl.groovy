pipelineJob("develop") {
	keepDependencies(false)
	definition {
		cpsScm {
			scriptPath("Jenkinsfile")
		}
	}
	disabled(false)
}

pipelineJob("prod") {
	keepDependencies(false)
	definition {
		cpsScm {
			scriptPath("Jenkinsfile")
		}
	}
	disabled(false)
}
