multibranchPipelineJob('Test Pipeline') {
    branchSources {
        git {
            id('1')
            remote('http://gitlab/ethereal-carnival/building-a-multibranch-pipeline-project.git')
            credentialsId('ede7c40b-876a-4160-82fb-9a77a712949c')
            includes('develop prod')
        }
        orphanedItemStrategy {
            discardOldItems {
            }
        }
        triggers {
            cron('*/2 * * * *')
        }
    }
}

multibranchPipelineJob('Hello Maven') {
    branchSources {
        git {
            id('2')
            remote('http://gitlab/ethereal-carnival/hello-maven.git')
            credentialsId('ede7c40b-876a-4160-82fb-9a77a712949c')
            includes('develop feature/*')
        }
        orphanedItemStrategy {
            discardOldItems {
            }
        }
        triggers {
            cron('*/2 * * * *')
        }
    }
}

job("Sleep") {
    steps {
        shell("sleep 2m")
    }
}