// pipeline{
//     agent any
    
//     stages{
//         stage('Build')
//         {
//             steps
//             {
//                 sh 'ls'
//             }
//         }
//         stage('Test')
//         {
//             steps
//             {
//                 sh 'pwd'
//             }
//         }
//         stage('Deploy')
//         {
//             steps
//             {
//                 sh 'echo welcome'
//             }

//         }
//     }
// }
// console colors
@Field def RESET = '\u001B[0m'
@Field def BLACK_BOLD = '\u001B[46m\u001B[1;30m' // skip stage msg
@Field def RED_BOLD = '\u001B[1;31m' // error msg
@Field def GREEN_BOLD = '\u001B[40m\u001B[1;32m' // stage name msg
@Field def YELLOW_BOLD = '\u001B[1;33m'
@Field def BLUE_BOLD = '\u001B[1;34m'
@Field def CYAN_BOLD = '\u001B[1;36m'
@Field def PURPLE_BOLD = '\u001B[1;35m' // info msg
@Field def WHITE_BOLD = '\u001B[1;37m'

node{
    stage("Kubectl version"){
        println "${GREEN_BOLD} STAGE: VersionList ${RESET}"
        sh("echo ls")
        sh("/usr/local/bin/kubectl version")
    }
    stage("Cluster information"){
        println "${GREEN_BOLD} STAGE: PODS info ${RESET}"
        sh("/usr/local/bin/kubectl get pods -n glass")
    }
    stage("List deployments"){
        println "${GREEN_BOLD} STAGE: Deploy info ${RESET}"
        sh("/usr/local/bin/kubectl get deploy -n glass")
    }
}