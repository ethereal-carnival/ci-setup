multibranchPipelineJob('tester') {
	branchSources {
		git {
			id('123456789') // IMPORTANT: use a constant and unique identifier
			remote('http://4c510e99f1ce/ethereal-carnival/building-a-multibranch-pipeline-project.git')
			credentialsId('ede7c40b-876a-4160-82fb-9a77a712949c')
			includes('develop|prod')
		}
	}
}