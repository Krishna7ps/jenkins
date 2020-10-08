import groovy.transform.Field

@Field def RESET = '\u001B[0m'
@Field def BLACK_BOLD = '\u001B[46m\u001B[1;30m' // skip stage msg
@Field def RED_BOLD = '\u001B[1;31m' // error msg
@Field def GREEN_BOLD = '\u001B[40m\u001B[1;32m' // stage name msg
@Field def YELLOW_BOLD = '\u001B[1;33m'
@Field def BLUE_BOLD = '\u001B[1;34m'
@Field def CYAN_BOLD = '\u001B[1;36m'
@Field def PURPLE_BOLD = '\u001B[1;35m' // info msg
@Field def WHITE_BOLD = '\u001B[1;37m'

ansiColor('xterm') {
    properties([parameters([string(defaultValue:"hello", description:"What's happening",name:'Greetings')])])
    node{
        stage("jenkins Variables"){
            println "${GREEN_BOLD} STAGE: jenkins variables ${RESET}"
            println "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
            withEnv(["PATHI=test/bin"]){
                println "${env.PATHI}"
            }
            println "${params.Greetings}"
            
            echo "url: $JENKINS_URL"
            echo "node name: $NODE_NAME"
            echo "job_name: $JOB_NAME "
            echo "build id: $BUILD_ID"
            echo "job url: $JOB_URL"
            echo "build url: $BUILD_URL"
            echo "workspace: $WORKSPACE"
        }
        stage("Kubectl version"){
            println "${GREEN_BOLD} STAGE: VersionList ${RESET}"
            sh("echo ls")
            sh("/usr/local/bin/kubectl version")
        }
    }
}