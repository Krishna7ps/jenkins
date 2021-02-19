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
    node{
        stage('checkout'){
            println "${GREEN_BOLD} STAGE: checkout ${RESET}"
            git branch: 'main', url: 'https://github.com/Krishna7ps/jenkins.git'
        }
        stage("Jenkins build status"){
            println "${GREEN_BOLD} STAGE: Posting Marker ${RESET}"
            shortCommit = sh(returnStdout: true, script: "git log -n 1 --pretty=format:'%h'").trim()
            //releaseMarker releaseName: "${shortCommit}", releaseStartTimestamp: "${currentBuild.startTimeInMillis}"
            releaseMarker applications: [application('GLASS')], releaseName: "${shortCommit}", releaseStartTimestamp: "${currentBuild.startTimeInMillis}", services: [service('GLASS: api')]
        }
    }
}

